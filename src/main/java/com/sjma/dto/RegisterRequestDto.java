package com.sjma.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequestDto {

	@NotBlank(message = "fill up the field")
	@Size(min = 5, max = 50, message = "set your Correct name")
	private String fullName;

	@NotBlank(message = "email-filed cannot be null")
	@Size(min = 5, max = 50, message = "set your Correct name")
	@Column(unique = true,
	comment = "User With EmailAlready exist")
	private String userName;

	@Email(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", message = "Enter Proper email format.")
	@NotBlank(message = "email-filed cannot be blank")
	@Column(unique = true)
	private String email;

	@NotBlank(message = "phoneNumber field cant be blank")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid PhoneNumber")
	private String mobileNumber;

	
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@!#$%^&*])[A-Za-z0-9@!#$%^&*]{8,}$",
	message = "Password Must contain one Upper and Lower case letter and specialcharacters and numbers")
	@Size(min = 8, max = 15, message = "password must be within 8to15 character")
	private String password;

	@NotBlank(message = "password can't be blank.")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@!#$%^&*])[A-Za-z0-9@!#$%^&*]{8,}$")
	@Size(min = 8, max = 15, message = "password must be within 8to15 character")
	private String confirmPassword;

	@NotNull(message = "tick terms&conditions checkBox")
	@AssertTrue(message = "please verify and tick.")
	private boolean terms;
}
