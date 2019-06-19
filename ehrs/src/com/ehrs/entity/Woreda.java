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
@Table(name="Woreda")
public class Woreda{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	

	@OneToOne
	@JoinColumn(name="regionId")
	private Region region;
	
	@OneToOne(mappedBy="Woreda")
	private Profile profile;
	
	@OneToOne(mappedBy="Woreda")
	private BirthRecord birthRecord;
	
	@OneToOne(mappedBy="Woreda")
	private DeathRecord deathRecord;
	
	@OneToOne(mappedBy="Woreda")
	private HealthCenter healthCenter;
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Woreda()
	{
		
	}

	public Woreda(String name) {
		this.name = name;
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Woreda [id=" + id + ", name=" + name + ", region=" + region + ", profile=" + profile + "]";
	}
	
	
}