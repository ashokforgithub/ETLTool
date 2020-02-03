package com.hack.project.projectDetails.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.project.projectDetails.service.ProjectDetailsService;

@RestController
@RequestMapping(value = "/projectDetails")
@CrossOrigin
public class ProjectDetailsController {
	@Autowired
	private ProjectDetailsService projectDetailsService;

	private final Logger LOGGER = LogManager.getLogger(this.getClass());

	@GetMapping(path = "getAllProjects", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<String>> fetchTemplateDetails() {
		LOGGER.debug("Inside Template Manager Controller");
		List<String> result = projectDetailsService.getProjectNames();

		// LOGGER.debug("record types got:
		// ="+templateFileDefinition.getTmpltrectypes());
		// templateFileDefinition.getTmpltrectypes().forEach(LOGGER::debug);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
