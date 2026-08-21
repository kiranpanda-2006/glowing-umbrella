package com.sjma.entity.candidateinfoEntity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class JobPreference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "expected role required.")
	private String role;
	
	@NotBlank(message = "preferred Location required.")
	private String preferredLocation;
	
	@NotBlank(message = "employeement type required.")
	private String employmentType;
	
	@NotBlank(message = "choose Experience level")
	private String experienceLevel;
	
	@NotNull(message = "expectation salary required.")
	private Double expectedSalary;
	
	@NotBlank(message = "work mode required.")
	private String workMode;
}
