package com.sjma.entity;

import com.sjma.converter.BooleanToStringConverter;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userRegisterTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 5, max = 50, message = "set your Correct name")
	private String name;

	@Transient
	private String firstName;

	@NotBlank(message = "email-filed cannot be null")
	@Size(min = 5, max = 50, message = "set your Correct name")
	@Column(unique = true)
	private String userName;

	@Email(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", message = "Enter Proper email format.")
	@NotBlank(message = "email-filed cannot be blank")
	@Column(unique = true)
	private String email;

	@NotBlank(message = "phoneNumber field cant be blank")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid PhoneNumber")
	private String mobileNumber;

	@NotBlank(message = "password can't be blank.")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@!#$%^&*])[A-Za-z0-9@!#$%^&*]{8,}$")
	@Size(min = 8, max = 15, message = "password must be within 8to15 character")
	private String password;
		
	@Convert(converter = BooleanToStringConverter.class)
	@NotNull
	private Boolean verified;

	@Convert(converter = BooleanToStringConverter.class)
	@NotNull
	private Boolean nonLocked;

	@Convert(converter = BooleanToStringConverter.class)
	@NotNull
	private Boolean disable;

	@Convert(converter = BooleanToStringConverter.class)
	@NotNull
	private Boolean deleted;

	@Convert(converter = BooleanToStringConverter.class)
	@NotNull
	private Boolean terms;
}
