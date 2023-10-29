package com.jsp.springboot1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot1.dto.User;
import com.jsp.springboot1.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;

	public User validateUser(String email, String password) {
		return userRepository.validateUser(email, password);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		Optional<User> opt = userRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	public User updateUserById(int id, User user) {
		Optional<User> opt = userRepository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {
			return userRepository.save(user);
		}
	}

	public boolean deleteUserById(int id) {
		Optional<User> opt = userRepository.findById(id);
		if (opt.isEmpty()) {
			return false;
		} else {
			userRepository.deleteById(id);
			return true;
		}
	}
}
