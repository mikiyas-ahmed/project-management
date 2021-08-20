package com.miki.pma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miki.pma.dao.ProjectRepository;
import com.miki.pma.dto.ProjectChart;
import com.miki.pma.entity.Project;
@Service
public class ProjectServices {
	@Autowired
	ProjectRepository proRepo;
	
	public Project save(Project project) {
		return proRepo.save(project);
	}	
	
	public List<Project> findAll() {
		return proRepo.findAll();
	}
	public List<ProjectChart> findStage(){
		return proRepo.findStage();
	}
}
