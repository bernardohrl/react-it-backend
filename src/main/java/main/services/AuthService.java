package main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.models.User;
import main.models.Response.AuthResponseMessage;
import main.repositories.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	private AuthResponseMessage sucess = new AuthResponseMessage("Autheticated Successfully!", 200);
	private AuthResponseMessage userNotFound = new AuthResponseMessage("Users not Found!", 404);
	private AuthResponseMessage invalidPassword = new AuthResponseMessage("Password does not match!", 403);
	
	public AuthResponseMessage Auththentication(String cpf, String password) {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		
		User matchUser = users.stream().filter(user -> user.getCpf().equals(cpf)).findFirst().orElse(null);
		
		return matchUser == null ? userNotFound : 
				!matchUser.getPassword().equals(password) ? invalidPassword : 
				   sucess;
	}
}
