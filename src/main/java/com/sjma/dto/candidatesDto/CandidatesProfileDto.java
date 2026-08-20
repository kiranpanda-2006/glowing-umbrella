package com.sjma.dto.candidatesDto;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CandidatesProfileDto {

	@NotBlank(message = "name required.")
	private String fullName;

	@NotBlank(message = "mobileNumber required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "invalid mobileNumber")
	private String mobileNumber;

	@NotNull(message = "DOB required.")
	private LocalDate dateOfBirth;

	@NotBlank(message = "field required")
	private String gender;

	@NotBlank(message = "location required")
	private String location;

	private MultipartFile profilePhoto;

	@NotBlank(message = "address required")
	private String address;
}
