package com.sjma.dto.candidatesDto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CandidatesProfileDto {

	private String fullName;
	
	private String mobileNumber;
	
	private Date dateOfBirth;
	
	private String gender;
	
	private String location;
	
	private String profilePhoto;
	
	private String address;
}
