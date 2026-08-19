package com.sjma.dto.candidatesDto;

import java.sql.Date;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDto {

	private String companyName;
	
	private String jobTitle;
	
	private String employeeType;
	
	private String location;
	
	private Date startDate;
	
	private Date endDate;
	
	private Boolean checkBox;
	
	private String description;
}
