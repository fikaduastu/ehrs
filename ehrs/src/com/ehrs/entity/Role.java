package com.ehrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String position;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="organizationId") private HealthCenter organizationId;
	 */
	
	public Role()
	{
		
	}

	public Role(String position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	/*
	 * public HealthCenter getOrganizationId() { return organizationId; }
	 * 
	 * public void setOrganizationId(HealthCenter organizationId) {
	 * this.organizationId = organizationId; }
	 */
	
}
