package com.ehrs.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="profile")
public class profile {
	
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
	private biologicaldetail biologicalDetail;
	
	@OneToOne
	@JoinColumn(name="birthRecordId")
	private birthrecord birthRecord;
	
	@OneToOne
	@JoinColumn(name="deathRecordId")
	private deathrecord deathRecord;
	
	@OneToOne
	@JoinColumn(name="userId")
	private user user;
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private woreda woreda;

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

	public biologicaldetail getBiologicalDetail() {
		return biologicalDetail;
	}

	public void setBiologicalDetail(biologicaldetail biologicalDetail) {
		this.biologicalDetail = biologicalDetail;
	}

	public birthrecord getBirthRecord() {
		return birthRecord;
	}

	public void setBirthRecord(birthrecord birthRecord) {
		this.birthRecord = birthRecord;
	}

	public deathrecord getDeathRecord() {
		return deathRecord;
	}

	public void setDeathRecord(deathrecord deathRecord) {
		this.deathRecord = deathRecord;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(woreda woreda) {
		this.woreda = woreda;
	}

	@Override
	public String toString() {
		return "profile [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", gender=" + gender + ", occupation=" + occupation + ", houseNumber=" + houseNumber
				+ ", mobileNumber=" + mobileNumber + ", emmergencyContactName=" + emmergencyContactName
				+ ", emmergencyContactPhone=" + emmergencyContactPhone + ", status=" + status + ", biologicalDetail="
				+ biologicalDetail + ", birthRecord=" + birthRecord + ", deathRecord=" + deathRecord + ", user=" + user
				+ ", woreda=" + woreda + "]";
	}




	

	
}