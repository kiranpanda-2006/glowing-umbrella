package com.sjma.entity.candidateinfoEntity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Certifications {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String certificationName;
	
	private String issueingOrganization;
	
	private LocalDate issuedAt;
	
	private String cresentialId;
	
	private String credentialUrl;
}
