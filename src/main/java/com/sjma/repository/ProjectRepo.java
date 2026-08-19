package com.sjma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjma.entity.candidateinfoEntity.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
