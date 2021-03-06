package com.miki.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miki.pma.entity.Employee;
import com.miki.pma.entity.Project;
import com.miki.pma.services.EmployeeServices;
import com.miki.pma.services.ProjectServices;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectServices proRepo;
	@Autowired
	EmployeeServices emplorepo;
	@GetMapping
	public String displayProjects(Model model) {
		List<Project> prolist= proRepo.findAll();
		model.addAttribute("projectList",prolist);
		return "project/list-projects";
	}
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aproject=new Project();
		List<Employee> emplo=emplorepo.findAll();
		model.addAttribute("project",aproject);
		model.addAttribute("employeeList",emplo);
		return "project/new-project";
	}
	@PostMapping("/save")
	public String createProject(Project project ,Model model) {
		proRepo.save(project);
		return "redirect:/";
	}
}
