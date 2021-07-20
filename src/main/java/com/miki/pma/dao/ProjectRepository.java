package com.miki.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.miki.pma.entity.Project;

public interface ProjectRepository extends CrudRepository <Project , Long> {

	@Override
	public List<Project> findAll();
}
