
package com.ehrs.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.JoinColumn; 
import javax.persistence.OneToOne; import javax.persistence.Table;

@Entity
@Table(name="woreda") 
public class woreda{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;

	@Column(name="name") 
	private String name;

	@OneToOne
	@JoinColumn(name="regionId")
	private region regionId;

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

	public region getRegionId() {
		return regionId;
	}

	public void setRegionId(region regionId) {
		this.regionId = regionId;
	}



}
