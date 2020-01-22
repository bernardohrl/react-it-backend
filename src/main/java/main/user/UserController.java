package main.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public List<EndUser> getUsersList() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/users/{id}")
	public EndUser getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody EndUser user) {
		userService.addUser(user); 
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody EndUser user, @PathVariable Integer id) {
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
}
