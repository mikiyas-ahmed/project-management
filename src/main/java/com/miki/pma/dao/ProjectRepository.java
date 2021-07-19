package com.miki.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.miki.pma.entity.Project;

public interface ProjectRepository extends CrudRepository <Project , Long> {

}
