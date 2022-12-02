package com.project.sacan.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sacan.model.StudentForm;
import com.project.sacan.utl.SacanJsonConstrants;

public class StudentFormHelper implements SacanJsonConstrants {
	private static Logger logger = LoggerFactory.getLogger(StudentFormHelper.class);
	
	//processSaveStudentFormRequestData
	public static StudentForm processSaveStudentFormRequestData(String jsonDataForSaveStudentForm) {
		StudentForm studentFormObj = new StudentForm();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSaveStudentForm, JsonObject.class);
			Integer studentId = convertedObject.get(_STUDENT_ID).getAsInt();
			String firstName = convertedObject.get(_FIRST_NAME).getAsString();
			String middleName = convertedObject.get(_MIDDLE_NAME).getAsString();
			String lastName = convertedObject.get(_LAST_NAME).getAsString();
			String collegeName = convertedObject.get(_COLLEGE_NAME).getAsString();
			String email = convertedObject.get(_EMAIL).getAsString();
			String faculty = convertedObject.get(_FACULTY).getAsString();
			Integer joiningYear = convertedObject.get(_JOINING_YEAR).getAsInt();
			String phoneNumber = convertedObject.get(_PHONE_NUMBER).getAsString();
			Integer expectedCompleteYear = convertedObject.get(_EXPECTED_COMPLETED_YEAR).getAsInt();
			String dateOfBith = convertedObject.get(_DATE_OF_BIRTH).getAsString();
			
			studentFormObj.setStudentId(studentId);
			studentFormObj.setFirstName(firstName);
			studentFormObj.setMiddleName(middleName);
			studentFormObj.setLastName(lastName);
			studentFormObj.setCollegeName(collegeName);
			studentFormObj.setEmail(email);
			studentFormObj.setFaculty(faculty);
			studentFormObj.setJoiningYear(joiningYear);
			studentFormObj.setPhoneNumber(phoneNumber);
			studentFormObj.setExpectedCompleteYear(expectedCompleteYear);
			studentFormObj.setDateOfBirth(dateOfBith);

		} catch (Exception ex) {
			if (logger.isDebugEnabled()) {
				logger.debug(StudentFormHelper.class + ex.getLocalizedMessage());
			}
		}
		return studentFormObj;
	}
	
	
	//processUpdateStudentFormRequestData
	public static StudentForm processUpdateStudentFormRequestData(String jsonDataForSaveStudentForm) {
		StudentForm studentFormObj = new StudentForm();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSaveStudentForm, JsonObject.class);
			Integer id = convertedObject.get(_ID).getAsInt();
			Integer studentId = convertedObject.get(_STUDENT_ID).getAsInt();
			String firstName = convertedObject.get(_FIRST_NAME).getAsString();
			String middleName = convertedObject.get(_MIDDLE_NAME).getAsString();
			String lastName = convertedObject.get(_LAST_NAME).getAsString();
			String collegeName = convertedObject.get(_COLLEGE_NAME).getAsString();
			String email = convertedObject.get(_EMAIL).getAsString();
			String faculty = convertedObject.get(_FACULTY).getAsString();
			Integer joiningYear = convertedObject.get(_JOINING_YEAR).getAsInt();
			String phoneNumber = convertedObject.get(_PHONE_NUMBER).getAsString();
			Integer expectedCompleteYear = convertedObject.get(_EXPECTED_COMPLETED_YEAR).getAsInt();
			String dateOfBith = convertedObject.get(_DATE_OF_BIRTH).getAsString();
			
			studentFormObj.setId(id);
			studentFormObj.setStudentId(studentId);
			studentFormObj.setFirstName(firstName);
			studentFormObj.setMiddleName(middleName);
			studentFormObj.setLastName(lastName);
			studentFormObj.setCollegeName(collegeName);
			studentFormObj.setEmail(email);
			studentFormObj.setFaculty(faculty);
			studentFormObj.setJoiningYear(joiningYear);
			studentFormObj.setPhoneNumber(phoneNumber);
			studentFormObj.setExpectedCompleteYear(expectedCompleteYear);
			studentFormObj.setDateOfBirth(dateOfBith);

		} catch (Exception ex) {
			if (logger.isDebugEnabled()) {
				logger.debug(StudentFormHelper.class + ex.getLocalizedMessage());
			}
		}
		return studentFormObj;
	}

}
