package com.sjma.entity.candidateinfoEntity;

import java.sql.Date;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CandidateProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "name required.")
	private String fullName;

	@NotBlank(message = "mobileNumber required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "invalid mobileNumber")
	private String mobileNumber;

	@NotNull(message = "DOB rquired")
	private LocalDate dateOfBirth;

	@NotBlank(message = "field required")
	private String gender;

	@NotBlank(message = "location required")
	private String location;

	private String profilePhoto;

	@NotBlank(message = "address required")
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
