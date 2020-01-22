package main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	private String CEP;
	private String publicArea;
	private String disctric;
	private String city;
	private String federativeUnity;
	private String complement;
	
	@OneToOne(mappedBy = "address")
    private User user;
	
	
	public Address() {}
	
	public Address(Integer id, String CEP, String publicArea, String disctric, String city, String federativeUnity) {
		super();
		this.id = id;
		this.CEP = CEP;
		this.publicArea = publicArea;
		this.disctric = disctric;
		this.city = city;
		this.federativeUnity = federativeUnity;
		this.complement = "";
	}
	
	public Address(Integer id, String CEP, String publicArea, String disctric, String city, String federativeUnity, String complement) {
		super();
		this.id = id;
		this.CEP = CEP;
		this.publicArea = publicArea;
		this.disctric = disctric;
		this.city = city;
		this.federativeUnity = federativeUnity;
		this.complement = complement;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getPublicArea() {
		return publicArea;
	}
	public void setPublicArea(String publicArea) {
		this.publicArea = publicArea;
	}
	public String getDisctric() {
		return disctric;
	}
	public void setDisctric(String disctric) {
		this.disctric = disctric;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFederativeUnity() {
		return federativeUnity;
	}
	public void setFederativeUnity(String federativeUnity) {
		this.federativeUnity = federativeUnity;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
}
