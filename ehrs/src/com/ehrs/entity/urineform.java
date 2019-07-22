package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="urineform")
public class urineform {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="wbc")
	private String wbc;
	
	@Column(name="rbc")
	private String rbc;
	
	@Column(name="cast")
	private String cast;
	
	@Column(name="gramStein")
	private String gramStein;
	
	@Column(name="wetSweat")
	private String wetSweat;
	
	@Column(name="glucose")
	private String glucose;
	
	@Column(name="ph")
	private String ph;
	
	@Column(name="uricAcid")
	private String uricAcid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWbc() {
		return wbc;
	}

	public void setWbc(String wbc) {
		this.wbc = wbc;
	}

	public String getRbc() {
		return rbc;
	}

	public void setRbc(String rbc) {
		this.rbc = rbc;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getGramStein() {
		return gramStein;
	}

	public void setGramStein(String gramStein) {
		this.gramStein = gramStein;
	}

	public String getWetSweat() {
		return wetSweat;
	}

	public void setWetSweat(String wetSweat) {
		this.wetSweat = wetSweat;
	}

	public String getGlucose() {
		return glucose;
	}

	public void setGlucose(String glucose) {
		this.glucose = glucose;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getUricAcid() {
		return uricAcid;
	}

	public void setUricAcid(String uricAcid) {
		this.uricAcid = uricAcid;
	}

	@Override
	public String toString() {
		return "urineform [id=" + id + ", wbc=" + wbc + ", rbc=" + rbc + ", cast=" + cast + ", gramStein=" + gramStein
				+ ", wetSweat=" + wetSweat + ", glucose=" + glucose + ", ph=" + ph + ", uricAcid=" + uricAcid + "]";
	}
	

}
