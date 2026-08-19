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
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String college;
	
	private String specialization;
	
	private String degree;
	
	private String startYear;
	
	private String graduationYear;
	
	private String cgpa;
	
}
