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
@Table(name="physicalexamination")
public class physicalexamination {
	
	
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
	private urineform urineForm;
	
	@OneToOne
	@JoinColumn(name="hematologyFormId")	
	private hematologyform hematologyForm;
	
	@OneToOne
	@JoinColumn(name="stoolFormId")	
	private stoolform stoolForm;

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

	public urineform getUrineForm() {
		return urineForm;
	}

	public void setUrineForm(urineform urineForm) {
		this.urineForm = urineForm;
	}

	public hematologyform getHematologyForm() {
		return hematologyForm;
	}

	public void setHematologyForm(hematologyform hematologyForm) {
		this.hematologyForm = hematologyForm;
	}

	public stoolform getStoolForm() {
		return stoolForm;
	}

	public void setStoolForm(stoolform stoolForm) {
		this.stoolForm = stoolForm;
	}

	@Override
	public String toString() {
		return "physicalexamination [id=" + id + ", vitalSign=" + vitalSign + ", tempreture=" + tempreture + ", bp="
				+ bp + ", resp=" + resp + ", heet=" + heet + ", gland=" + gland + ", chest=" + chest + ", cvs=" + cvs
				+ ", abdomen=" + abdomen + ", genitoUrinary=" + genitoUrinary + ", muscloSkeletal=" + muscloSkeletal
				+ ", skin=" + skin + ", cns=" + cns + ", melto=" + melto + ", sensor=" + sensor + ", impression="
				+ impression + ", urineForm=" + urineForm + ", hematologyForm=" + hematologyForm + ", stoolForm="
				+ stoolForm + "]";
	}

	
	
}
