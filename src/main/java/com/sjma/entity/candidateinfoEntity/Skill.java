package com.sjma.entity.candidateinfoEntity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String technicalSkill;
	
	private String programingLanguage;
	
	private String frameworks;
	
	private String dbKnowledge;
	
	private String tools;
}
