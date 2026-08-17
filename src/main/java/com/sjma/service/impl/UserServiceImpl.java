package com.sjma.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;
import com.sjma.repository.UserRepository;
import com.sjma.service.UserService;
import com.sjma.util.EntityUserUtil;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	@Autowired
	private  EntityUserUtil helper;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(RegisterRequestDto requestDto) {
		
		User user
		= helper.mapToEntity(requestDto);
		
		userRepository.save(user);
		
	}

	@Override
	public Optional<User> findBYId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
