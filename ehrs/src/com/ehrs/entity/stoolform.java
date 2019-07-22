package com.ehrs.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="stoolform")
public class stoolform {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="directToolExam")
	private String directToolExam;
	
	@Column(name="pusCell")
	private String pusCell;
	
	@Column(name="rbc")
	private String rbc;
	
	@Column(name="occultBloodCell")
	private String occultBloodCell;
	
	@Column(name="hpyloriStoolAgent")
	private String hpyloriStoolAgent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDirectToolExam() {
		return directToolExam;
	}

	public void setDirectToolExam(String directToolExam) {
		this.directToolExam = directToolExam;
	}

	public String getPusCell() {
		return pusCell;
	}

	public void setPusCell(String pusCell) {
		this.pusCell = pusCell;
	}

	public String getRbc() {
		return rbc;
	}

	public void setRbc(String rbc) {
		this.rbc = rbc;
	}

	public String getOccultBloodCell() {
		return occultBloodCell;
	}

	public void setOccultBloodCell(String occultBloodCell) {
		this.occultBloodCell = occultBloodCell;
	}

	public String getHpyloriStoolAgent() {
		return hpyloriStoolAgent;
	}

	public void setHpyloriStoolAgent(String hpyloriStoolAgent) {
		this.hpyloriStoolAgent = hpyloriStoolAgent;
	}

	@Override
	public String toString() {
		return "stoolform [id=" + id + ", directToolExam=" + directToolExam + ", pusCell=" + pusCell + ", rbc=" + rbc
				+ ", occultBloodCell=" + occultBloodCell + ", hpyloriStoolAgent=" + hpyloriStoolAgent + "]";
	}
	
	
	
}
