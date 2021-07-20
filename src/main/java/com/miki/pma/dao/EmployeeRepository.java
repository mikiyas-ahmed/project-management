package com.miki.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.miki.pma.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
