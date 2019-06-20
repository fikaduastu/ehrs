package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Override
	public String toString() {
		return "Admin [id=" + id + ", type=" + type + ", email=" + email + ", userName=" + userName + ", password="
				+ password + ", region=" + region + "]";
	}

	@Column(name="type")
	private String type;
	
	@Column(name="email")
	private String email;
	
	@Column(name="userName")
	private String userName;
	


	@Column(name="password")
	private String password;
	
	@Column(name="region")
	private String region;
	
	public Admin()
	{
		
	}
	
	public Admin(String type, String email, String userName, String password, String region) {
		this.type = type;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
}
