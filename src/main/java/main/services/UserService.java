package main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.models.User;
import main.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	
	public User getUser(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
