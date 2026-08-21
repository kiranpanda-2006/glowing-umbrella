package com.sjma.dto.candidatesDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDto {

	@NotBlank(message = "College name Required")
	private String college;
	
	@NotBlank(message = "Specilization Required.")
	private String specialization;
	
	@NotBlank(message = "degree Required.")
	private String degree;
	
	@NotBlank(message = "enter start academic year.")
	private String startYear;
	
	@NotBlank(message = "enter finised/ongoing academic year.")
	private String graduationYear;
	
	@NotBlank(message = "Secured mark required.")
	private String cgpa;
}
