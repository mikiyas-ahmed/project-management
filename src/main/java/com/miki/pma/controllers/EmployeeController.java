package com.miki.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository emplorepo;
	@GetMapping("/new")
	public String employeeForm(Model model) {
		Employee employee= new Employee();
		model.addAttribute(employee);
		return "new-employee";
	}
	@PostMapping("/save")
	public String regiterEmployee(Employee employee, Model model) {
		emplorepo.save(employee);
		return "redirect:/employee/new";
	}
	

}
