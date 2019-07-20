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
@Table(name="deathrecord")
public class deathrecord {

	
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
	
	@OneToOne
	@JoinColumn(name="organizationId")
	private healthcenter organizationId;
	
	@OneToOne
	@JoinColumn(name="woredaId")
	private woreda woreda;

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

	public healthcenter getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(healthcenter organizationId) {
		this.organizationId = organizationId;
	}

	public woreda getWoreda() {
		return woreda;
	}

	public void setWoreda(woreda woreda) {
		this.woreda = woreda;
	}

	@Override
	public String toString() {
		return "deathrecord [id=" + id + ", dateOfDeath=" + dateOfDeath + ", reasonForDeath=" + reasonForDeath
				+ ", funeralPlace=" + funeralPlace + ", funeralDate=" + funeralDate + ", organizationId="
				+ organizationId + ", woreda=" + woreda + "]";
	}
	


	
}
