package com.miki.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.dao.ProjectRepository;
import com.miki.pma.entity.Employee;
import com.miki.pma.entity.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository emplorepo;
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
	public String createProject(Project project,@RequestParam List<Long> employees ,Model model) {
		proRepo.save(project);
		Iterable<Employee>emploList=emplorepo.findAllById(employees);
		for(Employee emplo: emploList) {
			emplo.setProject(project);
			emplorepo.save(emplo);
		}
		return "redirect:/projects/new";
	}
}
