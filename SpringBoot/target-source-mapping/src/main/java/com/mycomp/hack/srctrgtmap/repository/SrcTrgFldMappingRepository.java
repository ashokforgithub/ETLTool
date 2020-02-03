/**
 * 
 */
package com.mycomp.hack.srctrgtmap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycomp.hack.srctrgtmap.entity.SrcTrgFldMapping;

/**
 * @author Ashok
 *
 */
@Repository
public interface SrcTrgFldMappingRepository extends JpaRepository<SrcTrgFldMapping, Long> {

	Optional<List<SrcTrgFldMapping>> findByTmpltfldfnid(Long templateId);

}
