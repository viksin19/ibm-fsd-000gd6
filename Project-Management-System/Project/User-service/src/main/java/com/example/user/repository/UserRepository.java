package com.example.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.data.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	List<User> findByusername(String username);

	List<User> findByulocation(String ulocation);

	List<User> findByavailability(String availability);

	User findByEmailAndPassword(String email, String password);
	
	List<User> findByudomain(String udomain);

	List<User> findByUserType(String role);
}
