package main.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotNull
	private String name;
	
	@ElementCollection
	Map<String, String> permissions = new HashMap<String, String>();

	@OneToMany(targetEntity = User.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
    private Set<User> users = new HashSet<User>();
	


	public Role() {}

	public Role(String name, Map<String, String> pemissions) {
		super();
		this.name = name;
		this.permissions = pemissions;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String>getPermissions() {
		return permissions;
	}
	public void setPermissions(Map<String, String> permissions) {
		this.permissions = permissions;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
