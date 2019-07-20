package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="birthrecord")
public class birthrecord {
	
	
	
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
	
	@Override
	public String toString() {
		return "birthrecord [id=" + id + ", dateOfBirth=" + dateOfBirth + ", motherName=" + motherName + ", fatherName="
				+ fatherName + ", childName=" + childName + ", gender=" + gender + ", weight=" + weight + ", remark="
				+ remark + ", healthCenter=" + healthCenter + ", woredaId=" + woredaId + "]";
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


	public healthcenter getHealthCenter() {
		return healthCenter;
	}


	public void setHealthCenter(healthcenter healthCenter) {
		this.healthCenter = healthCenter;
	}


	public woreda getWoredaId() {
		return woredaId;
	}


	public void setWoredaId(woreda woredaId) {
		this.woredaId = woredaId;
	}


	@OneToOne
	@JoinColumn(name="organizationId")
	private healthcenter healthCenter;
	
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private woreda woredaId;


	

	
}
