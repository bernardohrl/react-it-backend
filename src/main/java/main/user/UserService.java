package main.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = new ArrayList<User>(Arrays.asList(
			new User("1", "Bernardo1", "CPF1"),
			new User("2", "Bernardo2", "CPF2"),
			new User("3", "Bernardo3", "CPF3")
		));
	
	
	public List<User> getAllUsers() {
		return users;
	}
	
	
	public User getUser(String id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
	}
	
	
	public void addUser(User user) {
		users.add(user);
	}
	
	
	public void updateUser(User user, String id) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				users.set(i, user);
			}
		}
	}
	
	
	public void deleteUser(String id) {
		users.removeIf(user -> user.getId().equals(id));
	}
}
