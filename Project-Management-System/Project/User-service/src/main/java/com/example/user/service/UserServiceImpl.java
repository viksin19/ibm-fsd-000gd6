package com.example.user.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.user.data.User;
import com.example.user.repository.UserRepository;
import com.example.user.shared.UserDto;


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
	public UserDto createNewUser(UserDto userDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		User userEntity = mapper.map(userDetail, User.class);
		userRepository.save(userEntity);
		UserDto uDto = mapper.map(userEntity, UserDto.class);
		return uDto;
	}

	@Override
	public UserDto getUserByEmail(String email) {
		User userEntity = userRepository.findByEmail(email);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto uDto = mapper.map(userEntity, UserDto.class);
		return uDto;
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
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteUser(Long id) {
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
	public List<User> getByRole(String role){
		return userRepository.findByUserType(role);
	}

}
