package com.sjma.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjma.dto.LoginRequestDto;
import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;
import com.sjma.exception.PasswordNotMatchException;
import com.sjma.service.UserService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	private final UserService userService;

	public AuthController(UserService userService) {
		this.userService = userService;
	}

	/*
	 * first we create the register page. we will take input through @ModelAttribute
	 * and sent those Data to Service layer for save into database.
	 */

	@GetMapping("/")
	public String registerPage(Model model) {
		model.addAttribute("user", new RegisterRequestDto());
		return "layout/auth/register";
	}

	@PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") RegisterRequestDto register,
    		BindingResult bindingResult,
    		Model model){
		
		if (bindingResult.hasErrors()) {
			
			model.addAttribute("error", bindingResult.getAllErrors());
			
			return "layout/auth/register";
		}
    	    	
			try {
				userService.save(register);
			} catch (PasswordNotMatchException e) {
				model.addAttribute("passwordError",e.getMessage());
				e.getMessage();
				return "layout/auth/register";
			}
    	
        return "redirect:/auth/login";
    }

	/*
	 * here we will take mobile number or email and password as its claims. and
	 * compared with existing data in the database
	 */

	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("login", new LoginRequestDto());
		return "layout/auth/login";
	}

	@PostMapping("/login")
	public String loginUser(@ModelAttribute("login") LoginRequestDto loginRequest) {
		return "layout/auth/login-success";
	}

}
