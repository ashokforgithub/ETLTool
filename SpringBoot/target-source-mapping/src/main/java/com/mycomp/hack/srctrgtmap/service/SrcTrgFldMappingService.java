/**
 * 
 */
package com.mycomp.hack.srctrgtmap.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.hack.srctrgtmap.entity.SrcTrgFldMapping;
import com.mycomp.hack.srctrgtmap.repository.SrcTrgFldMappingRepository;

/**
 * @author Ashok
 *
 */
@Service
public class SrcTrgFldMappingService {
	
	@Autowired
	private SrcTrgFldMappingRepository srcTrgFldMappingRepositoryRepository;
	private final Logger LOGGER = LogManager.getLogger(this.getClass());
	
	public Optional<List<SrcTrgFldMapping>> fetchMappings(Long templateId)
	{
		Optional<List<SrcTrgFldMapping>> lstSrcTrgFldMappings =srcTrgFldMappingRepositoryRepository.findByTmpltfldfnid(templateId);
		LOGGER.debug("Record Types Obtained="+ lstSrcTrgFldMappings);
		return lstSrcTrgFldMappings;
	}

}
