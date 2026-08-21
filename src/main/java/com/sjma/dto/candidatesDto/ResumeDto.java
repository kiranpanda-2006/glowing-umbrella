package com.sjma.dto.candidatesDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumeDto {

	@NotBlank(message = "give your resume for better finding jobs for you.")
	private String resume;
}
