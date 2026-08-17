package com.sjma.util;

import org.springframework.stereotype.Component;

import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;

@Component
public class EntityUserUtil {
	
	
	
	public User mapToEntity(RegisterRequestDto requestDto) {
		
		User user = new User();
		
		user.setName(requestDto.getFullName());
		user.setUserName(requestDto.getUserName());
		user.setEmail(requestDto.getEmail());
		user.setMobileNumber(requestDto.getMobileNumber());
		user.setPassword(requestDto.getPassword());
		user.setTerms(requestDto.isTerms());
		user.setVerified(true);
		user.setNonLocked(true);
		user.setDisable(false);
		user.setDeleted(false);
		
		return user;
	}

}
