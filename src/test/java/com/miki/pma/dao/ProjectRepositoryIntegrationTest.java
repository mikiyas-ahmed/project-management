package com.miki.pma.dao;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import com.miki.pma.entity.Project;

@SpringBootTest
@RunWith(SpringRunner.class)
@SqlGroup(@Sql( executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts= {"classpath:schema.sql","classpath:data.sql"}))
public class ProjectRepositoryIntegrationTest {
	@Autowired
	ProjectRepository proRepo;
	@Test
	public void ifNewProjectSaved_thenSuccess() {
		Project newProject=new Project("new Project","COMPLETED","test Description");
		proRepo.save(newProject);
		assertEquals(5,proRepo.findAll().size());
	}

}
