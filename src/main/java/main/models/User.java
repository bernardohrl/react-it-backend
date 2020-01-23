package main.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotNull
	@Size(min = 3, max = 100)
	private String name;
	
	@NotNull
	@Column(unique = true)
	private String cpf;
	
	@NotNull
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	@OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "phone_id", referencedColumnName = "id")
    private Set<Phone> phones = new HashSet<Phone>();
	
	@OneToMany(targetEntity = Email.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "email_id", referencedColumnName = "id")
	private Set<Email> emails = new HashSet<Email>();
	
	@ManyToOne
	@JoinColumn
	@JsonIdentityReference(alwaysAsId = true)
    private Role role;
	
	

	public User() { }
	
	public User(String name, String cpf, String password, Address address, Set<Phone> phones, Set<Email> emails, Role role) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.password = password;
		this.address = address;
		this.phones = phones;
		this.emails = emails;
		this.role = role;
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
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	
	public Set<Email> getEmails() {
		return emails;
	}
	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
