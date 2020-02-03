/**
 * 
 */
package com.mycomp.hack.srctrgtmap.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.hack.srctrgtmap.entity.SrcTrgFldMapping;
import com.mycomp.hack.srctrgtmap.service.SrcTrgFldMappingService;

/**
 * @author Ashok
 *
 */
@RestController
@RequestMapping("/target-source-mapping")
public class TargetSourceMappingController {
	
	@Autowired
	private SrcTrgFldMappingService recordService;
	private final Logger LOGGER = LogManager.getLogger(this.getClass());
	
	@CrossOrigin
	@GetMapping(path="/template/{templateId}", produces= {MediaType.APPLICATION_JSON_VALUE} )
	public Optional<List<SrcTrgFldMapping>> fetchMappings(@PathVariable(name="templateId") Long templateId)
	{
		return recordService.fetchMappings(templateId);
	}

}
