package com.sjma.entity.candidateinfoEntity;

import java.sql.Date;
import java.time.LocalDate;

import com.sjma.converter.BooleanToStringConverter;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String companyName;
	
	private String jobTitle;
	
	private String employmentType;
	
	private String location;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	@Convert(converter = BooleanToStringConverter.class)
	private Boolean currentelyWorking;
	
	@Lob
	private String description;
}
