package com.miki.pma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miki.pma.dao.EmployeeRepository;
import com.miki.pma.dao.ProjectRepository;

@SpringBootApplication
public class ProjectManagementApplication {

	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	ProjectRepository proRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
//	@Bean
//	CommandLineRunner runner() {
//		
//		return args->{
//			Employee emp1= new Employee("miki","akmed","miki@gmail.com");
//			Employee emp2= new Employee("yas","eshetu","eshetu@gmail.com");
//			
//			Employee emp3= new Employee("mikilovska","huss","huss@gmail.com");
//			Employee emp4= new Employee("eyob","kibret","ayalew@gmail.com");
//			
//			Employee emp5= new Employee("tedi","belay","tedi@gmail.com");
//			Employee emp6= new Employee("pomi","habtem","pomi@gmail.com");
//			
//			
//			Employee emp7= new Employee("nati","tamrat","nati@gmail.com");
//			Employee emp8= new Employee("yabi","alemu","yabi@gmail.com");
//			Employee emp9= new Employee("ayalew","muhe","muhe@gmail.com");
//			
//			Project pro1= new Project("ATM machine","INPROGRESS","building atm mchine");
//			Project pro2= new Project("medical AI","INPROGRESS","medical AI for helping the medical area");
//			Project pro3= new Project("Mobile Banking","NOTSTARTED","building a mobile app");
//			Project pro4= new Project("Web scrapping","NOTSTARTED","new web scrapping from main websites");
//			
//			
//			
//			pro1.setEmployees(Arrays.asList(emp1,emp2,emp4));
//			pro2.setEmployees(Arrays.asList(emp3,emp4,emp1));
//			pro3.setEmployees(Arrays.asList(emp3,emp2));
//			pro4.setEmployees(Arrays.asList(emp1,emp2));
//			
//			emp1.setProjects(Arrays.asList(pro1,pro2,pro4));
//			emp2.setProjects(Arrays.asList(pro1,pro3,pro4));
//			emp3.setProjects(Arrays.asList(pro2,pro3));
//			emp4.setProjects(Arrays.asList(pro1,pro2));
//			
//			empRepo.save(emp1);
//			empRepo.save(emp2);
//			empRepo.save(emp3);
//			empRepo.save(emp4);
//			empRepo.save(emp5);
//			empRepo.save(emp6);
//			empRepo.save(emp7);
//			empRepo.save(emp8);
//			empRepo.save(emp9);
//			
//			
//			proRepo.save(pro1);
//			proRepo.save(pro2);
//			proRepo.save(pro3);
//			proRepo.save(pro4);
//			
//		};
//		


}
