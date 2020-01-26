package main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.models.User;
import main.models.Response.AuthResponseMessage;
import main.services.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/authenticate")
	public AuthResponseMessage authenticate(@RequestBody User payload) {
		return authService.Auththentication(payload.getCpf(), payload.getPassword());
	}
}
