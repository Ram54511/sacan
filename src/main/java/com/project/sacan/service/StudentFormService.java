package com.project.sacan.service;

import java.util.Optional;

import com.project.sacan.model.StudentForm;

public interface StudentFormService {
	//saveStudentForm
	public StudentForm saveStudentForm(StudentForm studentFormObj) throws Exception;
	
	//updateStudentForm
	public StudentForm updateStudentForm(StudentForm studentFormObj) throws Exception;
	
	//getStudentForm
	public Optional<StudentForm> getStudentFormById(Integer id) throws Exception;
	
	//deleteStudentById
	public void deleteStudentFormById(Integer id) throws Exception;

}
