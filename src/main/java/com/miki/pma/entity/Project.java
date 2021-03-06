package com.miki.pma.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="project_seq")
	@SequenceGenerator(name = "project_seq", allocationSize = 1)
	private long projectId;
	@Override
	public String toString() {
		return "Project [name=" + name + ", stage=" + stage + ", description=" + description + "]";
	}
	private String name;
	private String stage; //NOTSTARTED FINISHED INPROGRESS
	private String description;
	
	@ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH}
	, fetch= FetchType.LAZY)
	@JoinTable(name="employee_project",
			joinColumns=@JoinColumn(name="project_id"),
			inverseJoinColumns=@JoinColumn(name="employee_id"))
	private List<Employee> employees;
	
	public Project() {
		super();
	}
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void addEmployee(Employee emp) {
		if(employees==null) {
			employees= new ArrayList<>();
		}
		employees.add(emp);
	}

}
