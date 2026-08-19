package com.sjma.entity.candidateinfoEntity;

import java.sql.Date;

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
	
	private String employeeType;
	
	private String location;
	
	private Date startDate;
	
	private Date endDate;
	
	@Convert(converter = BooleanToStringConverter.class)
	private Boolean checkBox;
	
	@Lob
	private String description;
}
