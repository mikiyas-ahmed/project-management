package com.miki.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.dao.ProjectRepository;
import com.miki.pma.entity.Employee;
import com.miki.pma.entity.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;
	@GetMapping("/")
	public String displayProjects(Model model) {
		List<Project> projects=proRepo.findAll();
		model.addAttribute("projectList", projects);
		List<Employee> employees=empRepo.findAll();
		model.addAttribute("employeeList",employees);
		return "main/Home";
	}
}
