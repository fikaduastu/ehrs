package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HealthCenter")
public class HealthCenter {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="website")
	private String website;
	
	@OneToOne(mappedBy="HealthCenter")
	private BirthRecord birthRecord;
	
	@OneToOne(mappedBy="HealthCenter")
	private ExaminationAssesment examinationAssesment;
	
	@OneToOne(mappedBy="HealthCenter")
	private User user;
	
	@OneToOne(mappedBy="HealthCenter")
	private DeathRecord deathRecord;
	
	/*
	 * @OneToOne(mappedBy="HealthCenter") private Role role;
	 */
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private Woreda woreda;
	
	public HealthCenter()
	{
		
	}

	public HealthCenter(String name, String type, String phoneNumber, String email, String website) {
		this.name = name;
		this.type = type;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.website = website;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public BirthRecord getBirthRecord() {
		return birthRecord;
	}

	public void setBirthRecord(BirthRecord birthRecord) {
		this.birthRecord = birthRecord;
	}

	public ExaminationAssesment getExaminationAssesment() {
		return examinationAssesment;
	}

	public void setExaminationAssesment(ExaminationAssesment examinationAssesment) {
		this.examinationAssesment = examinationAssesment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DeathRecord getDeathRecord() {
		return deathRecord;
	}

	public void setDeathRecord(DeathRecord deathRecord) {
		this.deathRecord = deathRecord;
	}

	/*
	 * public Role getRole() { return role; }
	 * 
	 * public void setRole(Role role) { this.role = role; }
	 */

	public Woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(Woreda woreda) {
		this.woreda = woreda;
	}
	
	
	
}
