package com.miki.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miki.pma.entity.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aproject=new Project();
		model.addAttribute("project",aproject);
		return "new-project";
	}
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		//
	}
}
