package com.sjma.service;

import java.util.Optional;

import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;

public interface UserService {
	
	void save(RegisterRequestDto usrequestDtoer);
	
	User findBYId(long id);
	
	User findByEmail(String email);
	
	User findByEmailOrPhoneNumber(String email,String phoneNumber);

}
