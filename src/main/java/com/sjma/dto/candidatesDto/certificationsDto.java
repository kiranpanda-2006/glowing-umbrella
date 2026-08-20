package com.sjma.dto.candidatesDto;
import java.sql.Date;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class certificationsDto {

	private String certificationName;
	
	private String issueingOrganization;
	
	private LocalDate issuedAt;
	
	private String cresentialId;
	
	private String credentialUrl;
}