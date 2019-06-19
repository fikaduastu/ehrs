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
@Table(name="PhysicalExamination")
public class PhysicalExamination {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="vitalSign")
	private String vitalSign;
	
	@Column(name="tempreture")
	private String tempreture;
	
	@Column(name="bp")
	private String bp;
	
	@Column(name="resp")
	private String resp;
	
	@Column(name="heet")
	private String heet;
	
	@Column(name="gland")
	private String gland;
	
	@Column(name="chest")
	private String chest;
	
	@Column(name="cvs")
	private String cvs;
	
	@Column(name="abdomen")
	private String abdomen;
	
	@Column(name="genitoUrinary")
	private String genitoUrinary;
	
	@Column(name="muscloSkeletal")
	private String muscloSkeletal;
	
	@Column(name="skin")
	private String skin;
	
	@Column(name="cns")
	private String cns;
	
	@Column(name="melto")
	private String melto;
	
	@Column(name="sensor")
	private String sensor;
	
	@Column(name="impression")
	private String impression;
	
	@OneToOne
	@JoinColumn(name="urineFormId")
	private UrineForm urineForm;
	
	@OneToOne
	@JoinColumn(name="hematologyFormId")	
	private HematologyForm hematologyForm;
	
	@OneToOne
	@JoinColumn(name="stoolFormId")	
	private StoolForm stoolForm;
	
	@OneToOne(mappedBy="PhysicalExamination")
	private ExaminationAssesment examinationAssesment;
	
	public PhysicalExamination()
	{
		
	}

	public PhysicalExamination(String vitalSign, String tempreture, String bp, String resp, String heet, String gland,
			String chest, String cvs, String abdomen, String genitoUrinary, String muscloSkeletal, String skin,
			String cns, String melto, String sensor, String impression) {
		this.vitalSign = vitalSign;
		this.tempreture = tempreture;
		this.bp = bp;
		this.resp = resp;
		this.heet = heet;
		this.gland = gland;
		this.chest = chest;
		this.cvs = cvs;
		this.abdomen = abdomen;
		this.genitoUrinary = genitoUrinary;
		this.muscloSkeletal = muscloSkeletal;
		this.skin = skin;
		this.cns = cns;
		this.melto = melto;
		this.sensor = sensor;
		this.impression = impression;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVitalSign() {
		return vitalSign;
	}

	public void setVitalSign(String vitalSign) {
		this.vitalSign = vitalSign;
	}

	public String getTempreture() {
		return tempreture;
	}

	public void setTempreture(String tempreture) {
		this.tempreture = tempreture;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getHeet() {
		return heet;
	}

	public void setHeet(String heet) {
		this.heet = heet;
	}

	public String getGland() {
		return gland;
	}

	public void setGland(String gland) {
		this.gland = gland;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getCvs() {
		return cvs;
	}

	public void setCvs(String cvs) {
		this.cvs = cvs;
	}

	public String getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(String abdomen) {
		this.abdomen = abdomen;
	}

	public String getGenitoUrinary() {
		return genitoUrinary;
	}

	public void setGenitoUrinary(String genitoUrinary) {
		this.genitoUrinary = genitoUrinary;
	}

	public String getMuscloSkeletal() {
		return muscloSkeletal;
	}

	public void setMuscloSkeletal(String muscloSkeletal) {
		this.muscloSkeletal = muscloSkeletal;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getCns() {
		return cns;
	}

	public void setCns(String cns) {
		this.cns = cns;
	}

	public String getMelto() {
		return melto;
	}

	public void setMelto(String melto) {
		this.melto = melto;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public String getImpression() {
		return impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
	}

	public UrineForm getUrineForm() {
		return urineForm;
	}

	public void setUrineForm(UrineForm urineForm) {
		this.urineForm = urineForm;
	}

	public HematologyForm getHematologyForm() {
		return hematologyForm;
	}

	public void setHematologyForm(HematologyForm hematologyForm) {
		this.hematologyForm = hematologyForm;
	}

	public StoolForm getStoolForm() {
		return stoolForm;
	}

	public void setStoolForm(StoolForm stoolForm) {
		this.stoolForm = stoolForm;
	}

	public ExaminationAssesment getExaminationAssesment() {
		return examinationAssesment;
	}

	public void setExaminationAssesment(ExaminationAssesment examinationAssesment) {
		this.examinationAssesment = examinationAssesment;
	}
	
	
	
}
