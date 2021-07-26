package com.miki.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.dao.ProjectRepository;
import com.miki.pma.dto.EmployeeProject;
import com.miki.pma.dto.ProjectChart;
import com.miki.pma.entity.Project;

@Controller
public class HomeController {

	@Value("${version}")
	private String ver;
	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;
	@GetMapping("/")
	public String displayProjects(Model model) throws JsonProcessingException {
		List<Project> projects=proRepo.findAll();
		model.addAttribute("projectList", projects);
		
		model.addAttribute("version",ver);
		
		List<ProjectChart> projectChart=proRepo.findStage();
		ObjectMapper objectMapper= new ObjectMapper();
		String projectChartJson= objectMapper.writeValueAsString(projectChart);
		model.addAttribute("projectChart",projectChartJson);
		
		List<EmployeeProject> employees=empRepo.employeeList();
		model.addAttribute("employeeList",employees);
		
		return "main/Home";
	}
}
