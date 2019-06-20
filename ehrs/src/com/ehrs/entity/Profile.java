package com.ehrs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="gender")
	private String gender;	
	
	@Column(name="occupation")
	private String occupation;	
	
	
	@Column(name="houseNumber")
	private String houseNumber;
	
	@Column(name="mobileNumber")
	private String mobileNumber;
	
	@Column(name="emmergencyContactName")
	private String emmergencyContactName;
	
	@Column(name="emmergencyContactPhone")
	private String emmergencyContactPhone;
	
	@Column(name="status")
	private String status;
	
	// below are for foreign key constraint with one to one relationships
	
	@OneToOne
	@JoinColumn(name="biologicalDetailId")
	private BiologicalDetail biologicalDetailId;
	
	@OneToOne
	@JoinColumn(name="birthRecordId")
	private BirthRecord birthRecord;
	
	@OneToOne
	@JoinColumn(name="deathRecordId")
	private DeathRecord deathRecord;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private Woreda woreda;
	
	@OneToMany(mappedBy="Profile")
	private List<ExaminationAssesment> examinationAssesment;
	
	public Profile()
	{
		
	}

	public Profile(String firstName, String middleName, String lastName, String gender, String occupation,
			String houseNumber, String mobileNumber, String emmergencyContactName, String emmergencyContactPhone,
			String status) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.occupation = occupation;
		this.houseNumber = houseNumber;
		this.mobileNumber = mobileNumber;
		this.emmergencyContactName = emmergencyContactName;
		this.emmergencyContactPhone = emmergencyContactPhone;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmmergencyContactName() {
		return emmergencyContactName;
	}

	public void setEmmergencyContactName(String emmergencyContactName) {
		this.emmergencyContactName = emmergencyContactName;
	}

	public String getEmmergencyContactPhone() {
		return emmergencyContactPhone;
	}

	public void setEmmergencyContactPhone(String emmergencyContactPhone) {
		this.emmergencyContactPhone = emmergencyContactPhone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BiologicalDetail getBiologicalDetailId() {
		return biologicalDetailId;
	}

	public void setBiologicalDetailId(BiologicalDetail biologicalDetailId) {
		this.biologicalDetailId = biologicalDetailId;
	}

	public BirthRecord getBirthRecord() {
		return birthRecord;
	}

	public void setBirthRecord(BirthRecord birthRecord) {
		this.birthRecord = birthRecord;
	}

	public DeathRecord getDeathRecord() {
		return deathRecord;
	}

	public void setDeathRecord(DeathRecord deathRecord) {
		this.deathRecord = deathRecord;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(Woreda woreda) {
		this.woreda = woreda;
	}

	public List<ExaminationAssesment> getExaminationAssesment() {
		return examinationAssesment;
	}

	public void setExaminationAssesment(List<ExaminationAssesment> examinationAssesment) {
		this.examinationAssesment = examinationAssesment;
	}
	
}