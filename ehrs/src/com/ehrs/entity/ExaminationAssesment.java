package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ExaminationAssesment")
public class ExaminationAssesment {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="mrn")
	private String mrn;
	
	@Column(name="date")
	private String date; // this is date
	
	@Column(name="presentingCompliant")
	private String presentingCompliant;
	
	@Column(name="historyOfPresentingCompliant")
	private String historyOfPresentingCompliant;
	
	@Column(name="pastMedicalHistory")
	private String pastMedicalHistory;
	
	@Column(name="drugHistory")
	private String drugHistory;
	
	@Column(name="familyHistory")
	private String familyHistory;
	
	@Column(name="personalSocialHistory")
	private String personalSocialHistory;
	
	@OneToOne
	@JoinColumn(name="physicalExaminationId")
	private PhysicalExamination physicalExamination;
	
	@OneToOne
	@JoinColumn(name="healthCenterId")
	private HealthCenter healthCenter;
	
	@ManyToOne
	@JoinColumn(name="profileId")
	private Profile profile;
	
	public ExaminationAssesment()
	{
		
	}

	public ExaminationAssesment(String mrn, String date, String presentingCompliant,
			String historyOfPresentingCompliant, String pastMedicalHistory, String drugHistory, String familyHistory,
			String personalSocialHistory) {
		this.mrn = mrn;
		this.date = date;
		this.presentingCompliant = presentingCompliant;
		this.historyOfPresentingCompliant = historyOfPresentingCompliant;
		this.pastMedicalHistory = pastMedicalHistory;
		this.drugHistory = drugHistory;
		this.familyHistory = familyHistory;
		this.personalSocialHistory = personalSocialHistory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPresentingCompliant() {
		return presentingCompliant;
	}

	public void setPresentingCompliant(String presentingCompliant) {
		this.presentingCompliant = presentingCompliant;
	}

	public String getHistoryOfPresentingCompliant() {
		return historyOfPresentingCompliant;
	}

	public void setHistoryOfPresentingCompliant(String historyOfPresentingCompliant) {
		this.historyOfPresentingCompliant = historyOfPresentingCompliant;
	}

	public String getPastMedicalHistory() {
		return pastMedicalHistory;
	}

	public void setPastMedicalHistory(String pastMedicalHistory) {
		this.pastMedicalHistory = pastMedicalHistory;
	}

	public String getDrugHistory() {
		return drugHistory;
	}

	public void setDrugHistory(String drugHistory) {
		this.drugHistory = drugHistory;
	}

	public String getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	public String getPersonalSocialHistory() {
		return personalSocialHistory;
	}

	public void setPersonalSocialHistory(String personalSocialHistory) {
		this.personalSocialHistory = personalSocialHistory;
	}

	public PhysicalExamination getPhysicalExamination() {
		return physicalExamination;
	}

	public void setPhysicalExamination(PhysicalExamination physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	public HealthCenter getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenter healthCenter) {
		this.healthCenter = healthCenter;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	

}
