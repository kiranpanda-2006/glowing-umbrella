package com.sjma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjma.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
