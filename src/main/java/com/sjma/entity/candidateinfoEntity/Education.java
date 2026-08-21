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
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
