package com.project.sacan.validator;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sacan.utl.SacanJsonConstrants;
import com.project.sacan.utl.SacanModuleConstrants;

public class StudentFromValidator implements SacanJsonConstrants, SacanModuleConstrants {

	public static ArrayList<String> validateStudentForm(String jsonDataForSaveStudentForm) {
		ArrayList<String> validateMessage = new ArrayList<String>();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSaveStudentForm, JsonObject.class);
			
			if (!convertedObject.has(_STUDENT_ID)) {
				validateMessage.add(STUDENT_ID_MISSED);
			}


			if (!convertedObject.has(_FIRST_NAME)) {
				validateMessage.add(FIRST_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_FIRST_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(FIRST_NAME_VALIDATION);
				}
			}
			

			if (!convertedObject.has(_MIDDLE_NAME)) {
				validateMessage.add(MIDDLE_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_MIDDLE_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(MIDDLE_NAME_VALIDATION);
				}
			}

			if (!convertedObject.has(_LAST_NAME)) {
				validateMessage.add(LAST_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_LAST_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(LAST_NAME_VALIDATION);
				}
			}

			if (!convertedObject.has(_COLLEGE_NAME)) {
				validateMessage.add(COLLEGE_NAME_KEY_MISSED);
			}

//			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			if (!convertedObject.has(_EMAIL)) {
				validateMessage.add(EMAIL_KEY_MISSED);
			} else {
				String email = convertedObject.get(_EMAIL).getAsString();
				if (email.isEmpty()) {
					validateMessage.add(EMAIL_VALIDATION);
				}

			}

//			String email = convertedObject.get(_EMAIL).getAsString();
//			if (Pattern.matches(regex, email)) {
//				validateMessage.add(email);
//			}

			if (!convertedObject.has(_JOINING_YEAR)) {
				validateMessage.add(JOINING_YEAR_KEY_MISSED);
			}
			
			if (!convertedObject.has(_PHONE_NUMBER)) {
				validateMessage.add(PHONE_NUMBER_MISSED);
			}else {
				String phoneNumber = convertedObject.get(_PHONE_NUMBER).getAsString();
				if(phoneNumber.length() <10 || phoneNumber.length()>10) {
					validateMessage.add(PHONE_NUMBER_VALIDATION);
				}
			}


			if (!convertedObject.has(_EXPECTED_COMPLETED_YEAR)) {
				validateMessage.add(EXPECTED_COMPLETED_YEAR);
			}

			if (!convertedObject.has(_FACULTY)) {
				validateMessage.add(FACULTY_KEY_MISSED);
			}
			
			if (!convertedObject.has(_DATE_OF_BIRTH)) {
				validateMessage.add(DATE_OF_BIRTH_KEY_MISSED);
			}


		} catch (Exception ex) {
			validateMessage.add(SPECIFIED_KEY_NOT_FOUND + ex.getLocalizedMessage());

		}
		return validateMessage;
	}
	
	
	//validateUpdateStudentForm
	public static ArrayList<String> validateUpdateStudentForm(String jsonDataForSaveStudentForm) {
		ArrayList<String> validateMessage = new ArrayList<String>();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSaveStudentForm, JsonObject.class);
			
			if (!convertedObject.has(_ID)) {
				validateMessage.add(ID_KEY_MISSED);
			}
			
			if (!convertedObject.has(_STUDENT_ID)) {
				validateMessage.add(STUDENT_ID_MISSED);
			}


			if (!convertedObject.has(_FIRST_NAME)) {
				validateMessage.add(FIRST_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_FIRST_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(FIRST_NAME_VALIDATION);
				}
			}
			

			if (!convertedObject.has(_MIDDLE_NAME)) {
				validateMessage.add(MIDDLE_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_MIDDLE_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(MIDDLE_NAME_VALIDATION);
				}
			}

			if (!convertedObject.has(_LAST_NAME)) {
				validateMessage.add(LAST_NAME_KEY_MISSED);
			}else {	
				String firstName = convertedObject.get(_LAST_NAME).getAsString();
				if (firstName.isEmpty() || firstName.length() > 15) {
					validateMessage.add(LAST_NAME_VALIDATION);
				}
			}

			if (!convertedObject.has(_COLLEGE_NAME)) {
				validateMessage.add(COLLEGE_NAME_KEY_MISSED);
			}

//			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			if (!convertedObject.has(_EMAIL)) {
				validateMessage.add(EMAIL_KEY_MISSED);
			} else {
				String email = convertedObject.get(_EMAIL).getAsString();
				if (email.isEmpty()) {
					validateMessage.add(EMAIL_VALIDATION);
				}

			}

//			String email = convertedObject.get(_EMAIL).getAsString();
//			if (Pattern.matches(regex, email)) {
//				validateMessage.add(email);
//			}

			if (!convertedObject.has(_JOINING_YEAR)) {
				validateMessage.add(JOINING_YEAR_KEY_MISSED);
			}
			
			if (!convertedObject.has(_PHONE_NUMBER)) {
				validateMessage.add(PHONE_NUMBER_MISSED);
			}else {
				String phoneNumber = convertedObject.get(_PHONE_NUMBER).getAsString();
				if(phoneNumber.length() <10 || phoneNumber.length()>10) {
					validateMessage.add(PHONE_NUMBER_VALIDATION);
				}
			}


			if (!convertedObject.has(_EXPECTED_COMPLETED_YEAR)) {
				validateMessage.add(EXPECTED_COMPLETED_YEAR);
			}

			if (!convertedObject.has(_FACULTY)) {
				validateMessage.add(FACULTY_KEY_MISSED);
			}
			
			if (!convertedObject.has(_DATE_OF_BIRTH)) {
				validateMessage.add(DATE_OF_BIRTH_KEY_MISSED);
			}


		} catch (Exception ex) {
			validateMessage.add(SPECIFIED_KEY_NOT_FOUND + ex.getLocalizedMessage());

		}
		return validateMessage;
	}


}
