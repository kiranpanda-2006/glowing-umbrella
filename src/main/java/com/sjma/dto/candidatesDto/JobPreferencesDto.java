package com.sjma.dto.candidatesDto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobPreferencesDto {

	@NotBlank(message = "expected role required.")
	private String role;
	
	@NotBlank(message = "preferred Location required.")
	private String preferredLocation;
	
	@NotBlank(message = "employeement type required.")
	private String employmentType;
	
	@NotBlank(message = "choose experience level")
	private String experienceLevel;
	
	@NotNull(message = "expectation salary required.")
	private Double expectedSalary;
	
	@NotBlank(message = "work mode required.")
	private String workMode;
	
}
