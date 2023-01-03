package com.JoabeJW.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JoabeJW.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
