package com.project.sacan.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sacan.model.StudentForm;
import com.project.sacan.repository.StudentFormRepository;

@Service
public class StudentFormImpl implements StudentFormService {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentFormImpl.class);

	@Autowired
	StudentFormRepository studentFormRepository;
	
	// saveStudentForm
	@Override
	public StudentForm saveStudentForm(StudentForm studentFormObj) throws Exception {
		if(logger.isDebugEnabled()) {
			logger.debug(StudentFormImpl.class + "saveStudentForm");
		}
//		StudentForm studentForm = new StudentForm();
//		studentFormObj.setFirstName(studentForm.getFirstName());
//		studentFormObj.setMiddleName(studentForm.getMiddleName());
//		studentFormObj.setLastName(studentForm.getLastName());
//		studentFormObj.setCollegeName(studentForm.getCollegeName());
//		studentFormObj.setPhoneNumber(studentForm.getPhoneNumber());
//		studentFormObj.setEmail(studentForm.getEmail());
//		studentFormObj.setFaculty(studentForm.getFaculty());
//		studentFormObj.setDateOfBirth(studentForm.getDateOfBirth());
//		studentFormObj.setJoiningYear(studentForm.getJoiningYear());
//		studentFormObj.setExpectedCompleteYear(studentForm.getExpectedCompleteYear());

		StudentForm studentFormSacan = studentFormRepository.save(studentFormObj);

		return studentFormSacan;
	}

	// updateStudentForm
	@Override
	public StudentForm updateStudentForm(StudentForm studentFormObj) throws Exception {
		if(logger.isDebugEnabled()) {
			logger.debug(StudentFormImpl.class + "updateStudentForm");
		}
		StudentForm studentFormSacan = studentFormRepository.findById(studentFormObj.getId()).orElse(null);
		return studentFormSacan;
	}
	
	
	//getStudentFormById
	@Override
	public Optional<StudentForm> getStudentFormById(Integer id) throws Exception {
		if(logger.isDebugEnabled()) {
			logger.debug(StudentFormImpl.class + "getStudentFormById");
		}
		return studentFormRepository.findById(id);
	}
	
	
	//deleteStudentFormById
	@Override
	public void  deleteStudentFormById(Integer id) throws Exception {
	//	StudentForm studentForm = null;
		if(logger.isDebugEnabled()) {
			logger.debug(StudentFormImpl.class + "deleteStudentFormById");
		}
		studentFormRepository.deleteById(id);
	}
}

