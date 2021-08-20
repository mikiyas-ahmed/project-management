package com.miki.pma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.dto.EmployeeProject;
import com.miki.pma.entity.Employee;

@Service
public class EmployeeServices {
	//using fields
	@Autowired
	EmployeeRepository empRepo;
	
	public Employee save(Employee employee) {
		return empRepo.save(employee);
	}	
	
	public List<Employee> findAll() {
		return empRepo.findAll();
	}
	public List<EmployeeProject> employeeList(){
		return empRepo.employeeList();
	}
}
