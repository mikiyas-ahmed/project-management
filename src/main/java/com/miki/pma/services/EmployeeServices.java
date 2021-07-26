package com.miki.pma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miki.pma.dao.EmployeeRepository;

@Service
public class EmployeeServices {
	//using fields
	@Autowired
	EmployeeRepository empRepo;
	
	//using constructor
	EmployeeRepository empRepo1;
	public EmployeeServices(EmployeeRepository empRepo1) {
		this.empRepo1 = empRepo1;
	}

	//using setter
	EmployeeRepository empRepo2;
	@Autowired
	public void setEmpRepo2(EmployeeRepository empRepo2) {
		this.empRepo2 = empRepo2;
	}
	
}
