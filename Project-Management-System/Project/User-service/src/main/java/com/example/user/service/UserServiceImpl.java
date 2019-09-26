package com.example.user.service;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
			e.printStackTrace();
		}

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
	public List<User> findByavailability(String availability) {
		// TODO Auto-generated method stub
		return userRepository.findByavailability(availability);
	}

	@Override
	public User findEmailAndPassword(String email, String password) {
		User userEntity = userRepository.findByEmailAndPassword(email, password);
		return userEntity;
	}

	@Override
	public List<User> findBydomain(String udomain) {
		// TODO Auto-generated method stub
		return userRepository.findByudomain(udomain);
	}

	@Override
	public List<User> getByRole(String role) {
		return userRepository.findByUserType(role);
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
}
