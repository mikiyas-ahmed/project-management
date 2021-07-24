package com.miki.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.miki.pma.dto.ProjectChart;
import com.miki.pma.entity.Project;

public interface ProjectRepository extends CrudRepository <Project , Long> {

	@Override
	public List<Project> findAll();
	
	@Query(nativeQuery=true , value="select stage as label, count(*) as value from project "
			+ "group by stage order by count(stage);")
	public List<ProjectChart> findStage();
}
