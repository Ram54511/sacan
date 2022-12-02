package com.project.sacan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;

@Entity
@Table(name = "sacan_students_notices")
public class SacanStudentsNotices implements Serializable, SacanDbTableName {
	/**
	 * auther : Ram Thapa
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID)
	private Long id;
	
	@Column(name = NOTICES_ID, nullable = false, unique = true)
	private String noticesId;
	
	@Column(name = TITLE, nullable = false, unique = true)
	private String title;
	
	@Column(name = DESCRIPTION, nullable = false, unique = true)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoticesId() {
		return noticesId;
	}

	public void setNoticesId(String noticesId) {
		this.noticesId = noticesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SacanStudentsNotices(Long id, String noticesId, String title, String description) {
		super();
		this.id = id;
		this.noticesId = noticesId;
		this.title = title;
		this.description = description;
	}

	public SacanStudentsNotices() {
		
	}
	
	
	
}
