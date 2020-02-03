/**
 * 
 */
package com.mycomp.hack.targetrecs.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.hack.targetrecs.entity.TargetRecordType;
import com.mycomp.hack.targetrecs.service.TargetRecordService;

/**
 * @author Ashok
 *
 */
@RestController
@RequestMapping("/target")
@CrossOrigin
public class TargetRecordController {
	
	@Autowired
	private TargetRecordService recordService;
	private final Logger LOGGER = LogManager.getLogger(this.getClass());
	
	@GetMapping(path="/records", produces= {MediaType.APPLICATION_JSON_VALUE} )
	public List<TargetRecordType> fetchAllRecTypes()
	{
		return recordService.fetchAllRecTypes();
	}

}
