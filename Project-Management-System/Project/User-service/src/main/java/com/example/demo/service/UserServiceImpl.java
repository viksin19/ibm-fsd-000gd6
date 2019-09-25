package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private Environment env;
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(Environment env, UserRepository userRepository) {
		super();
		this.env = env;
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public List<User> findByusername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByusername(username);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public UserDto saveUser(UserDto user) {

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User userEntity = mapper.map(user, User.class);
		userRepository.save(userEntity);
		UserDto uDto = mapper.map(userEntity, UserDto.class);
		return uDto;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<User> findBylocation(String ulocation) {
		// TODO Auto-generated method stub
		return userRepository.findByulocation(ulocation);
	}

	@Override
	public List<User> findByavailability(String avialability) {
		// TODO Auto-generated method stub
		return userRepository.findByavialability(avialability);
	}

	@Override
	public User findEmailAndPassword(String email,String password) {
		User userEntity = userRepository.findByEmailAndPassword(email,password);
		return userEntity;
	}

	@Override
	public List<User> findBydomain(String udomain) {
		// TODO Auto-generated method stub
		return userRepository.findByudomain(udomain);
	}
	
	@Override
	public User getByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	@Override
	public List<User> getByRole(String role){
		return userRepository.findByUserType(role);
	}

}