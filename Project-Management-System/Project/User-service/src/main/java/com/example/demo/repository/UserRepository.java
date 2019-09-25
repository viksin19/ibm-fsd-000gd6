package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByusername(String username);

	List<User> findByulocation(String ulocation);

	List<User> findByavialability(String avialability);

	User findByEmailAndPassword(String email, String password);
	
	User findByEmail(String email);
	
	List<User> findByudomain(String udomain);

	List<User> findByUserType(String role);
}