package main.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<EndUser> getAllUsers() {
		List<EndUser> users = new ArrayList<EndUser>();
		
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	
	public EndUser getUser(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	
	public void addUser(EndUser user) {
		userRepository.save(user);
	}
	
	
	public void updateUser(EndUser user) {
		userRepository.save(user);
	}
	
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
