package com.miki.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.miki.pma.dto.EmployeeProject;
import com.miki.pma.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	
	@Override
	public List<Employee> findAll();
	
	@Query(nativeQuery=true,value="select e.first_name as firstName, e.lastName, count(ep.employee_id) as projectCount "
			+ "from employee e left join employee_project ep "
			+ "on e.employee_id= ep.employee_id "
			+ "group by e.first_name ,e.lastName order by 3 desc;")
	public List<EmployeeProject> employeeList();
}
