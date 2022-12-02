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
@Table(name = "SacanStudentsMessage")
public class SacanStudentsMessage implements Serializable, SacanDbTableName {

	/**
	 * Auther:Ram Thapa
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID)
	private Long id;

	@Column(name = SUBJECT, nullable = false)
	private String subject;
	
	@Column(name = MESSAGE_ID, nullable = false, unique = true)
	private String messageId;

	@Column(name = FULLNAME, nullable = false)
	private String fullName;

	@Column(name = EMAIL, nullable = false)
	private String email;

	@Column(name = PHONE_NUMBER, nullable = false)
	private String phoneNumber;

	@Column(name = MESSAGE, nullable = false)
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SacanStudentsMessage(Long id, String subject, String messageId, String fullName, String email,
			String phoneNumber, String message) {
		super();
		this.id = id;
		this.subject = subject;
		this.messageId = messageId;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	public SacanStudentsMessage() {
		
	}

	

}
