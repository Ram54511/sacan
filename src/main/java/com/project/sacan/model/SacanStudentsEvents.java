package com.project.sacan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;
/*
 *auther:Ram thapa 
 * */

@Entity
@Table(name = "sacan_student_events")
public class SacanStudentsEvents implements Serializable, SacanDbTableName {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID)
	private Long id;
	
	@Column(name = EVENT_ID, nullable = false)
	private String eventId;
	
	@Column(name = TITLE, nullable = false)
	private String title;
	
	@Column(name = DATETIME, nullable = false)
	private Date DateTime;
	
	@Column(name = DESCRIPTION, nullable = false)
	private String Description;
	
	@Column(name = IMAGE, nullable = false)
	private byte[] image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateTime() {
		return DateTime;
	}

	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public SacanStudentsEvents(Long id, String eventId, String title, Date dateTime, String description, byte[] image) {
		super();
		this.id = id;
		this.eventId = eventId;
		this.title = title;
		DateTime = dateTime;
		Description = description;
		this.image = image;
	}

	public SacanStudentsEvents() {
		super();
	}
	
	

}
