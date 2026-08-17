package com.sjma.service;

import java.util.Optional;

import com.sjma.dto.RegisterRequestDto;
import com.sjma.entity.User;

public interface UserService {
	
	void save(RegisterRequestDto usrequestDtoer);
	
	Optional<User> findBYId(long id);
	
	Optional<User> findByEmail(String email);

}
