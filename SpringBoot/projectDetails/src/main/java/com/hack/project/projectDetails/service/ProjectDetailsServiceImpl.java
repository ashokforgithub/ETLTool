package com.hack.project.projectDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack.project.projectDetails.entity.ProjectDetails;
import com.hack.project.projectDetails.repository.ProjectDetailsRepository;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{

	@Autowired
	private ProjectDetailsRepository ProjectDetailsRepository;
	
	@Override
	public List<String> getProjectNames() {
	
		List<String> projectNames=new ArrayList<>();
		List<ProjectDetails> result=this.ProjectDetailsRepository.findAll();
		
		for(ProjectDetails aProjectDetails:result){
			projectNames.add(aProjectDetails.getProjname());
		}
		return projectNames;
	}

}
