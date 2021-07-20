package com.miki.pma.controllers;

import java.util.List;

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
	@GetMapping
	public String displayEmployee(Model model) {
		List<Employee> emplo=emplorepo.findAll();
		model.addAttribute("employeeList",emplo);
		return "employee/list-employees";
	}
	@GetMapping("/new")
	public String employeeForm(Model model) {
		Employee aEmployee= new Employee();
		model.addAttribute("employee",aEmployee );
		return "employee/new-employee";
	}
	@PostMapping("/save")
	public String regiterEmployee(Employee employee, Model model) {
		emplorepo.save(employee);
		return "redirect:/employee/new";
	}
	

}
