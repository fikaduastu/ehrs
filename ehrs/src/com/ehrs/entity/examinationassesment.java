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

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="examinationassesment")
public class examinationassesment {

	
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
	private physicalexamination physicalExamination;
	
	@OneToOne
	@JoinColumn(name="healthCenterId")
	private healthcenter healthCenter;
	
	@ManyToOne
	@JoinColumn(name="profileId")
	private profile profile;

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

	public physicalexamination getPhysicalExamination() {
		return physicalExamination;
	}

	public void setPhysicalExamination(physicalexamination physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	public healthcenter getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(healthcenter healthCenter) {
		this.healthCenter = healthCenter;
	}

	public profile getProfile() {
		return profile;
	}

	public void setProfile(profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "examinationassesment [id=" + id + ", mrn=" + mrn + ", date=" + date + ", presentingCompliant="
				+ presentingCompliant + ", historyOfPresentingCompliant=" + historyOfPresentingCompliant
				+ ", pastMedicalHistory=" + pastMedicalHistory + ", drugHistory=" + drugHistory + ", familyHistory="
				+ familyHistory + ", personalSocialHistory=" + personalSocialHistory + ", physicalExamination="
				+ physicalExamination + ", healthCenter=" + healthCenter + ", profile=" + profile + "]";
	}
	

}
