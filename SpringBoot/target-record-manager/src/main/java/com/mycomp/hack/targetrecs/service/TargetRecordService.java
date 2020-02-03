/**
 * 
 */
package com.mycomp.hack.targetrecs.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.hack.targetrecs.entity.TargetRecordType;
import com.mycomp.hack.targetrecs.repository.TargetRecordRepository;

/**
 * @author Ashok
 *
 */
@Service
public class TargetRecordService {
	
	@Autowired
	private TargetRecordRepository recordRepository;
	private final Logger LOGGER = LogManager.getLogger(this.getClass());
	
	public List<TargetRecordType> fetchAllRecTypes()
	{
		List<TargetRecordType> lstTargetRecordTypes =recordRepository.findAll();
		LOGGER.debug("Record Types Obtained="+ lstTargetRecordTypes);
		return lstTargetRecordTypes;
	}

}
