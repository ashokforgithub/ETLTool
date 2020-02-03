package com.hack.project.projectDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hack.project.projectDetails.entity.ProjectDetails;

public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, String> {

}
