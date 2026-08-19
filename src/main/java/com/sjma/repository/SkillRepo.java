package com.sjma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjma.entity.candidateinfoEntity.Skill;

public interface SkillRepo extends JpaRepository<Skill,Long>{

}
