package com.miki.pma.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long employeeId;
	private String firstName;
	private String lastname;
	private String email;
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH}
				, fetch= FetchType.LAZY)
	@JoinColumn(name="project_Id")
	private Project project;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastname, String email) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
