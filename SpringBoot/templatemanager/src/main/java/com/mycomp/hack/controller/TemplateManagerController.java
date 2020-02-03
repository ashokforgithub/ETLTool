/**
 * 
 */
package com.mycomp.hack.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.hack.entity.TemplateFileDefinition;
import com.mycomp.hack.service.TemplateFDService;

/**
 * @author Ashok
 *
 */
@RestController
@RequestMapping(value = "/template-manager")
@CrossOrigin
public class TemplateManagerController {

	@Autowired
	private TemplateFDService fdService;

	private final Logger LOGGER = LogManager.getLogger(this.getClass());

	@GetMapping(path = "template/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<TemplateFileDefinition> fetchTemplateDetails(@Valid @PathVariable(name = "id") Long id) {
		LOGGER.debug("Inside Template Manager Controller");
		TemplateFileDefinition aTemplateFileDefinition = null;
		Optional<TemplateFileDefinition> templateFileDefinition = fdService.findFDbyId(id);
		if (templateFileDefinition.isPresent()) {
			aTemplateFileDefinition = templateFileDefinition.get();
		}
		// LOGGER.debug("record types got:
		// ="+templateFileDefinition.getTmpltrectypes());
		// templateFileDefinition.getTmpltrectypes().forEach(LOGGER::debug);
		return new ResponseEntity<>(aTemplateFileDefinition, HttpStatus.OK);
	}

	@GetMapping(path = "getAllTemplate", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Map<Long,String>> fetchAllTemplate() {
		Map<Long,String> result = new HashMap<>();
		List<TemplateFileDefinition> templateFileDefinition = fdService.findAll();
		for (TemplateFileDefinition aTemplateFileDefinition : templateFileDefinition) {
			result.put(aTemplateFileDefinition.getTmpltfldfnid(), aTemplateFileDefinition.getFlname());
		}
		// LOGGER.debug("record types got:
		// ="+templateFileDefinition.getTmpltrectypes());
		// templateFileDefinition.getTmpltrectypes().forEach(LOGGER::debug);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
