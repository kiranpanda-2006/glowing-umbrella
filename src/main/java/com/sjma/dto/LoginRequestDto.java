package com.sjma.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {

    @NotBlank(message = "fill this field for login")
    private String login;

    @NotBlank(message = "fill this filled for go to home.")
    private String password;
}