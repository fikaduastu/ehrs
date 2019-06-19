package com.ehrs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BirthRecord")
public class BirthRecord {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="dateOfBirth")
	private String dateOfBirth;	 // this is date fixed
	
	@Column(name="motherName")
	private String motherName;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="childName")
	private String childName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="weight")
	private float weight;
	
	@Column(name="remark")
	private String remark; // datatype is text fixed
	
	
	@OneToOne(mappedBy="BirthRecord")
	private Profile profile;
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private Woreda woreda;
	
	@Column(name="organizationId")
	private HealthCenter organizationId;
	
	public BirthRecord() {
		
	}

	public BirthRecord(String dateOfBirth, String motherName, String fatherName, String childName, String gender,
			float weight, String remark) {
		this.dateOfBirth = dateOfBirth;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.childName = childName;
		this.gender = gender;
		this.weight = weight;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(Woreda woreda) {
		this.woreda = woreda;
	}

	public HealthCenter getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(HealthCenter organizationId) {
		this.organizationId = organizationId;
	}
	
}
