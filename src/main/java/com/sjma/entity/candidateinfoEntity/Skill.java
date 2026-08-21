package com.sjma.entity.candidateinfoEntity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "TechnicalSkill field required.")
	private String technicalSkill;
	
	@NotBlank(message = "known programming Languages Requireds.")
	private String programingLanguage;
	
	private String frameworks;
	
	@NotBlank(message = "Database Skill rquired.")
	private String dbknowledge;
	
	@NotBlank(message = "Kno tools required.")
	private String tools;
	
	private String otherSkills;
}
