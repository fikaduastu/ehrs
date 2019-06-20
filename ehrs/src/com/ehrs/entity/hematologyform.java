package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hematologyform")
public class hematologyform {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	@Column(name="cbc")
	private String cbc;
	
	@Column(name="rbc")
	private String rbc;
	
	@Column(name="mcv")
	private String mcv;
	
	@Column(name="mov")
	private String mov;
	
	@Column(name="esr")
	private String esr;
	
	@Column(name="platletCount")
	private String platletCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCbc() {
		return cbc;
	}

	public void setCbc(String cbc) {
		this.cbc = cbc;
	}

	public String getRbc() {
		return rbc;
	}

	public void setRbc(String rbc) {
		this.rbc = rbc;
	}

	public String getMcv() {
		return mcv;
	}

	public void setMcv(String mcv) {
		this.mcv = mcv;
	}

	public String getMov() {
		return mov;
	}

	public void setMov(String mov) {
		this.mov = mov;
	}

	public String getEsr() {
		return esr;
	}

	public void setEsr(String esr) {
		this.esr = esr;
	}

	public String getPlatletCount() {
		return platletCount;
	}

	public void setPlatletCount(String platletCount) {
		this.platletCount = platletCount;
	}
	

	
}
