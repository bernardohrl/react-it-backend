package main.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = Arrays.asList(
			new User("1", "Bernardo1", "CPF1"),
			new User("2", "Bernardo2", "CPF2"),
			new User("3", "Bernardo3", "CPF3")
		);
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUser(String id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
	}
}
