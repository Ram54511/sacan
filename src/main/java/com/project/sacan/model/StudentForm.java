package com.project.sacan.model;

import java.io.Serializable;

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
@Table(name = "student_form")
public class StudentForm implements SacanDbTableName, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = STUDENT_ID, nullable = false)
	private Integer studentId;
	
	@Column(name = FIRST_NAME, nullable = false)
	private String firstName;

	@Column(name = MIDDLE_NAME,nullable = false)
	private String middleName;

	@Column(name = LAST_NAME, nullable = false)
	private String lastName;

	@Column(name = COLLEGE_NAME, nullable = false)
	private String collegeName;

	@Column(name = PHONE_NUMBER, nullable = false)
	private String phoneNumber;

	@Column(name = EMAIL, nullable = false)
	private String email;

	@Column(name = FACULTY, nullable = false)
	private String faculty;

	@Column(name = DATE_OF_BIRTH, nullable = false)
	private String dateOfBirth;

	@Column(name = JOINING_YEAR, nullable = false)
	private Integer joiningYear;

	@Column(name = EXPECTED_COMPLETE_YEAR, nullable = false)
	private Integer expectedCompleteYear;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(Integer joiningYear) {
		this.joiningYear = joiningYear;
	}

	public Integer getExpectedCompleteYear() {
		return expectedCompleteYear;
	}

	public void setExpectedCompleteYear(Integer expectedCompleteYear) {
		this.expectedCompleteYear = expectedCompleteYear;
	}

	public StudentForm() {
		super();
	}

	public StudentForm(Integer id, Integer studentId, String firstName, String middleName, String lastName,
			String collegeName, String phoneNumber, String email, String faculty, String dateOfBirth, Integer joiningYear,
			Integer expectedCompleteYear) {
		super();
		Id = id;
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.collegeName = collegeName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.joiningYear = joiningYear;
		this.expectedCompleteYear = expectedCompleteYear;
	}
	

}