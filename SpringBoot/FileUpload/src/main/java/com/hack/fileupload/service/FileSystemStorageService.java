package com.hack.fileupload.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.hack.fileupload.entity.Srcdata;
import com.hack.fileupload.entity.TemplateFileDefinition;
import com.hack.fileupload.entity.TemplateFileDetails;
import com.hack.fileupload.repository.SrcdataRepository;

@Service
public class FileSystemStorageService {

	@Autowired
	private SrcdataRepository srcdataRepository;

	public void store(MultipartFile file, Long templateId) {

		BufferedReader br;
		List<String> result = new ArrayList<>();
		Srcdata srcdata = null;
		try {

			String line;
			InputStream is = file.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				result.addAll(Arrays.asList(line.split(",")));
			}
			RestTemplate restTemplate = new RestTemplate();
			final String baseUrl = "http://localhost:" + 6001 + "/template-manager/template/" + templateId;
			URI uri = new URI(baseUrl);
			ResponseEntity<TemplateFileDefinition> templateResult = restTemplate.getForEntity(uri,
					TemplateFileDefinition.class);
			if (templateResult.hasBody()) {
				TemplateFileDefinition a = templateResult.getBody();
				List<TemplateFileDetails> b = a.getTmpltrectypes().get(0).getTmpltflddtls();
				Collections.sort(b);
				int i = 0;
				for (TemplateFileDetails c : b) {
					srcdata = new Srcdata();
					srcdata.setLinenum(1L);
					srcdata.setSourcdataid(Long.valueOf(i+1));
					srcdata.setTemplateid(templateId);
					srcdata.setTemplatekey(c.getFldname());
					srcdata.setTemplatevalue(result.get(i));
					i++;
					srcdataRepository.save(srcdata);
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
