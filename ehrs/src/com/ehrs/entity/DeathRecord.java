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
@Table(name="DeathRecord")
public class DeathRecord {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="dateOfDeath")
	private String dateOfDeath;	// the data type is date
	
	@Column(name="reasonForDeath")
	private String reasonForDeath;
	
	@Column(name="funeralPlace")
	private String funeralPlace;
	
	@Column(name="funeralDate")
	private String funeralDate;	// the data type is date
	
	@OneToOne(mappedBy="DeathRecord")
	private Profile profile;
	
	@OneToOne
	@JoinColumn(name="organizationId")
	private HealthCenter organizationId;
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private Woreda woreda;
	
	public DeathRecord()
	{
		
	}

	public DeathRecord(String dateOfDeath, String reasonForDeath, String funeralPlace, String funeralDate) {
		this.dateOfDeath = dateOfDeath;
		this.reasonForDeath = reasonForDeath;
		this.funeralPlace = funeralPlace;
		this.funeralDate = funeralDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getReasonForDeath() {
		return reasonForDeath;
	}

	public void setReasonForDeath(String reasonForDeath) {
		this.reasonForDeath = reasonForDeath;
	}

	public String getFuneralPlace() {
		return funeralPlace;
	}

	public void setFuneralPlace(String funeralPlace) {
		this.funeralPlace = funeralPlace;
	}

	public String getFuneralDate() {
		return funeralDate;
	}

	public void setFuneralDate(String funeralDate) {
		this.funeralDate = funeralDate;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public HealthCenter getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(HealthCenter organizationId) {
		this.organizationId = organizationId;
	}

	public Woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(Woreda woreda) {
		this.woreda = woreda;
	}
	
}
