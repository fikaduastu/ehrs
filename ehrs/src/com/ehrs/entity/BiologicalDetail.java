package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BiologicalDetail")
public class BiologicalDetail {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="eyeColor")
	private String eyeColor;
	
	@Column(name="skinColor")
	private String skinColor;
	
	@Column(name="hairColor")
	private String hairColor;
	
	@Column(name="bloodType")
	private String bloodType;
	
	
	@Column(name="height")
	private float height;
	
	@Column(name="weight")
	private float weight;
	
	@Column(name="disability")
	private String disability;
	
	@OneToOne(mappedBy="BiologicalDetail")
	private Profile profile;
	
	public BiologicalDetail()
	{
		
	}

	public BiologicalDetail(String eyeColor, String skinColor, String hairColor, String bloodType,
			float height, float weight, String disability) {
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.hairColor = hairColor;
		this.bloodType = bloodType;
		this.height = height;
		this.weight = weight;
		this.disability = disability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
}
