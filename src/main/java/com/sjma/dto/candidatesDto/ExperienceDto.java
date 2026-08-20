package com.sjma.dto.candidatesDto;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDto {

	private String companyName;
	
	private String jobTitle;
	
	private String employmentType;
	
	private String location;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private Boolean currentelyWorking;
	
	private String description;
}
