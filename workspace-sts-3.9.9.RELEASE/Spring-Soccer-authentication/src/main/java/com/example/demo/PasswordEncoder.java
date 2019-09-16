package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        String encoded = encoder.encode("test123");//bob's password
	        System.out.println(encoded);
	        encoded = encoder.encode("test234");//sara's password
	        System.out.println(encoded);
	}

}
