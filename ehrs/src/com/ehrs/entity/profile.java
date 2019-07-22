package com.ehrs.entity;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	public profile(String firstName, String middleName, String lastName, String gender, String occupation,
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

	public profile(String firstName, String middleName, String lastName, String gender, String occupation,
			String houseNumber, String mobileNumber, String emmergencyContactName, String emmergencyContactPhone,
			String status, biologicaldetail biologicalDetail, birthrecord birthRecord, deathrecord deathRecord,
			com.ehrs.entity.user user, com.ehrs.entity.woreda woreda) {
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
		this.biologicalDetail = biologicalDetail;
		this.birthRecord = birthRecord;
		this.deathRecord = deathRecord;
		this.user = user;
		this.woreda = woreda;
	}

	public profile() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emmergencyContactName == null) ? 0 : emmergencyContactName.hashCode());
		result = prime * result + ((emmergencyContactPhone == null) ? 0 : emmergencyContactPhone.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		profile other = (profile) obj;
		if (emmergencyContactName == null) {
			if (other.emmergencyContactName != null)
				return false;
		} else if (!emmergencyContactName.equals(other.emmergencyContactName))
			return false;
		if (emmergencyContactPhone == null) {
			if (other.emmergencyContactPhone != null)
				return false;
		} else if (!emmergencyContactPhone.equals(other.emmergencyContactPhone))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	
}