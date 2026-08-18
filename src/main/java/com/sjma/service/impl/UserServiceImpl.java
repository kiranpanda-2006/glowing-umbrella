package com.sjma.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;
import com.sjma.exception.DuplicateResourceException;
import com.sjma.exception.PasswordNotMatchException;
import com.sjma.exception.ResourceNotFoundException;
import com.sjma.repository.UserRepository;
import com.sjma.service.UserService;
import com.sjma.util.EntityUserUtil;
import com.sun.jdi.request.DuplicateRequestException;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Autowired
	private EntityUserUtil helper;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(RegisterRequestDto requestDto) {

		User user = helper.mapToEntity(requestDto);

		Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());

		if (optionalUser.isPresent()) {
			throw new DuplicateResourceException("User already ExistByEmail.");
		}

		if (!requestDto.getPassword().equals(requestDto.getConfirmPassword())) {
			throw new PasswordNotMatchException("Password and ConfirmPassword is not matched.");
		}

		userRepository.save(user);
	}

	@Override
	public User findBYId(long id) {
		Optional<User> optionalUser = userRepository.findById(id);

		if (optionalUser.isEmpty()) {
			throw new ResourceNotFoundException("User Not found with this email.");
		}

		return optionalUser.get();
	}

	@Override
	public User findByEmail(String email) {

		Optional<User> optionalUser = userRepository.findByEmail(email);

		if (optionalUser.isEmpty()) {
			throw new ResourceNotFoundException("User Not found with this email.");
		}

		return optionalUser.get();
	}

	@Override
	public User findByEmailOrPhoneNumber(String email, String phoneNumber) {
		Optional<User> optionalUser = 
				userRepository.findByEmailOrMobileNumber(email, phoneNumber);
		if(optionalUser.isEmpty()) {
			throw new ResourceNotFoundException("Invalid UserName or Password.");
		}
		
		return optionalUser.get();
	}

}
