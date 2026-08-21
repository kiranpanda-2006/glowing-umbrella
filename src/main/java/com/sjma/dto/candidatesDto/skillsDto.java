package com.sjma.dto.candidatesDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class skillsDto {

	@NotBlank(message = "TechnicalSkill field required.")
	private String technicalSkill;
	
	@NotBlank(message = "known programming Languages Requireds.")
	private String programingLanguage;
	
	private String frameworks;
	
	@NotBlank(message = "Database Skill rquired.")
	private String database;
	
	@NotBlank(message = "Kno tools required.")
	private String tools;
	
	private String otherSkills;
}
