/**
 * 
 */
package com.mycomp.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycomp.hack.entity.TemplateFileDefinition;

/**
 * @author Ashok
 *
 */
@Repository
public interface TemplateFDRepository extends JpaRepository<TemplateFileDefinition, Long> {

}
