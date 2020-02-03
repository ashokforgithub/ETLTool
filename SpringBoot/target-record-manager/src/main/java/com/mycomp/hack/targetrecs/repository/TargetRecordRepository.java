/**
 * 
 */
package com.mycomp.hack.targetrecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycomp.hack.targetrecs.entity.TargetRecordType;

/**
 * @author Ashok
 *
 */
@Repository
public interface TargetRecordRepository extends JpaRepository<TargetRecordType, Long> {

}
