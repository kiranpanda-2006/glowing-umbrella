package com.sjma.entity.candidateinfoEntity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class JobPreference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String role;
	
	private String preferedLocation;
	
	private String employeeType;
	
	private String experienceLevel;
	
	private Double expectedSalary;
	
	private String workMode;
}
