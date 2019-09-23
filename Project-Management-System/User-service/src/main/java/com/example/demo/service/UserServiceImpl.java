package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Project;
import com.example.demo.entity.User;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.shared.UserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	private ProjectRepository projectRepository;
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	public UserServiceImpl(UserRepository userRepository, ProjectRepository projectRepository,
			BCryptPasswordEncoder bcrypt) {
		super();
		this.userRepository = userRepository;
		this.projectRepository = projectRepository;
		this.bcrypt = bcrypt;
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
		// TODO Auto-generated method stub
		user.setPassword(bcrypt.encode(user.getPassword() ));
		Optional<Project> oproj = projectRepository.findById(user.getProjectid());
		Project project = oproj.get();
		user.setProject(project);
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user1=mapper.map(user,User.class);
		userRepository.save(user1);
		UserDto uDto=mapper.map(user1, UserDto.class);
		
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
	public List<User> findByemail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByemail(email);
	}

	@Override
	public List<User> findBydomain(String udomain) {
		// TODO Auto-generated method stub
		return userRepository.findByudomain(udomain);
	}

}