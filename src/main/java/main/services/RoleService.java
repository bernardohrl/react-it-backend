package main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.models.Role;
import main.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> getAllRoles() {
		List<Role> roles = new ArrayList<Role>();
		
		roleRepository.findAll().forEach(roles::add);
		return roles;
	}
	
	
	public Role getRole(Integer id) {
		return roleRepository.findById(id).orElse(null);
	}
	
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
	
	
	public void updateRole(Role role) {
		roleRepository.save(role);
	}
	
	
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);
	}
}
