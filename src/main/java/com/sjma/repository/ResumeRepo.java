package com.sjma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjma.entity.candidateinfoEntity.Resume;

public interface ResumeRepo extends JpaRepository<Resume, Long>{

}
