package com.sjma.entity.candidateinfoEntity;

import java.sql.Date;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CandidateProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullName;

	private String mobileNumber;

	private Date dateOfBirth;

	private String gender;

	private String location;

	private String profilePhoto;

	private String address;
	
	@OneToMany
	private List<Certifications> certification;
	
	@OneToMany
	private List<Education> education;
	
	@OneToMany
	private  List<Experience> experience;
	
	@OneToOne
	private JobPreference jobPreference;
	
	@OneToMany
	private List<Project> projects;
	
	@OneToMany
	private List<Skill> skills;
	
	@OneToOne
	private Resume resume;
}
