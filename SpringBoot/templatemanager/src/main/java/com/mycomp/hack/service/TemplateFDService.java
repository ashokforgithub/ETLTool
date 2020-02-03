/**
 * 
 */
package com.mycomp.hack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.hack.entity.TemplateFileDefinition;
import com.mycomp.hack.repository.TemplateFDRepository;

/**
 * @author Ashok
 *
 */
@Service
public class TemplateFDService {
	
	@Autowired
	private TemplateFDRepository fdRepository;
	
	public Optional<TemplateFileDefinition> findFDbyId(Long id)
	{
		return fdRepository.findById(id);
	}
	
	public List<TemplateFileDefinition> findAll(){
		return fdRepository.findAll();
	}

}
