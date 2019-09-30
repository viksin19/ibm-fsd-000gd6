package com.example.user.service;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.user.data.User;
import com.example.user.model.CreateTeamsRequestModel;
import com.example.user.model.ProjectIdRequestModel;
import com.example.user.repository.UserRepository;
import com.example.user.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private Environment env;
	private UserRepository userRepository;

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	public UserServiceImpl(Environment env, UserRepository userRepository, JavaMailSender mailSender) {
		super();
		this.env = env;
		this.userRepository = userRepository;
		this.mailSender = mailSender;
	}

	@Override
	public UserDto createNewUser(UserDto userDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		User userEntity = mapper.map(userDetail, User.class);
		userRepository.save(userEntity);
		
		try {
			this.sendMail(userEntity.getEmail(), "Hello ", this.getbody(userEntity));
		} catch (MessagingException e) {
			UserDto uDto = mapper.map(userEntity, UserDto.class);
			return uDto;
		}

		UserDto uDto = mapper.map(userEntity, UserDto.class);
		return uDto;
	}

	@Override
	public UserDto getUserByEmail(String email) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User userEntity = userRepository.findByEmail(email);
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
		return userRepository.findByUsername(username);
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
	public List<User> findByavailability(String availability) {
		// TODO Auto-generated method stub
		return userRepository.findByAvailability(availability);
	}

	@Override
	public User findEmailAndPassword(String email, String password) {
		User userEntity = userRepository.findByEmailAndPassword(email, password);
		return userEntity;
	}

	@Override
	public List<User> getByRole(String role) {
		return userRepository.findByUserTypeAndAvailability(role, "yes");
	}

	public void sendMail(String to, String subject, String body) throws MessagingException {

		MimeMessage mail = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mail, true);

		helper.setTo(to);
		helper.setSubject(subject);
		helper.setFrom("ibmtectraining007@gmail.com");
		mail.setContent(body, "text/html");

		mailSender.send(mail);
	}

	public String getbody(User user) {

		return "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "<!-- Latest compiled and minified CSS -->\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n"
				+ "\r\n" + "<!-- jQuery library -->\r\n"
				+ "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n"
				+ "\r\n" + "<!-- Popper JS -->\r\n"
				+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n"
				+ "\r\n" + "<!-- Latest compiled JavaScript -->\r\n"
				+ "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n"
				+ "<style>\r\n" + "body{\r\n"
				+ "background-image: url(\"https://wallpapercave.com/wp/wp2351082.jpg\");\r\n"
				+ "background-repeat: no-repeat;\r\n" + "background-attachment: fixed;\r\n" + "width: 100%;\r\n"
				+ "	height: 800px;\r\n" + "}\r\n" + "</style>\r\n" + "</head>\r\n" + "<body>\r\n" + "<br>\r\n"
				+ "<div class=\"container\">\r\n" + "<h2 styles=" + "color: green;"
				+ ">Successefully Registered !!!</h2><br>" + "<h6>" + user.getUsername() + "</h6><br>" + "<h6>"
				+ user.getUlocation() + "</div>\r\n" + "</body>\r\n" + "</html>";
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(String email) {
		User userDetails = userRepository.findByEmail(email);
		userRepository.delete(userDetails);
	}

	@Override
	public boolean updateAssignedProjectId(ProjectIdRequestModel projectDetail) {
		User userDetail = userRepository.findByEmail(projectDetail.getPmanagerEmail());
		userDetail.setAvailability("no");
		userDetail.setUlocation(projectDetail.getPlocation());
		userDetail.setProjectid(projectDetail.getProjectId());
		userRepository.save(userDetail);
		return true;
	}

	@Override
	public boolean updateDeletedProjectId(ProjectIdRequestModel projectDetail) {
		User userDetail = userRepository.findByEmail(projectDetail.getPmanagerEmail());
		userDetail.setAvailability("yes");
		userDetail.setUlocation(projectDetail.getPlocation());
		userDetail.setProjectid(null);
		userRepository.save(userDetail);
		return false;
	}

	@Override
	public void updateDeletedTaskId(Long taskId) {
		List<User> userDetail = userRepository.findByTaskId(taskId);
		for(int i=0; i<userDetail.size(); i++) {
			userDetail.get(i).setTaskId(null);
			userDetail.get(i).setAvailability("yes");
		}
		
		userRepository.saveAll(userDetail);
	}

	@Override
	public void updateAssignedtaskId(CreateTeamsRequestModel teamDetail) {
		User userDetail = userRepository.findByEmail(teamDetail.getUemail());
		userDetail.setAvailability("no");
		userDetail.setuAssigndate(teamDetail.getUassigndate());
		userDetail.setTaskId(teamDetail.getTaskId());
		userDetail.setProjectid(teamDetail.getProjectId());
		userRepository.save(userDetail);
		
	}

	@Override
	public List<?> getAllTeam(Long taskId) {
		List<?> teams = userRepository.findByTaskId(taskId);
		return teams;
	}

	@Override
	public boolean deleteTeamMember(String email) {
		User userDetail = userRepository.findByEmail(email);
		userDetail.setAvailability("yes");
		userDetail.setTaskId(null);
		userDetail.setuStatus(null);
		userRepository.save(userDetail);
		return false;
	}

	

	
}
