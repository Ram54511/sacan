package com.project.sacan.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sacan.helper.StudentFormHelper;
import com.project.sacan.message.Message;
import com.project.sacan.model.StudentForm;
import com.project.sacan.service.StudentFormService;
import com.project.sacan.utl.CommanMessage;
import com.project.sacan.validator.StudentFromValidator;

@RestController
@RequestMapping("/api")
public class StudentFormController implements CommanMessage {
	private static Logger logger = LoggerFactory.getLogger(StudentFormController.class);

	@Autowired
	StudentFormService studentFormService;

	// saveStudentForm
	@RequestMapping(value = "/savestudentform", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody Message saveStudentForm(@RequestBody String jsonDataForStudentForm) {
		Message message = new Message();

		// validate jsonDataForStudentForm
		ArrayList<String> validationResult;
		validationResult = StudentFromValidator.validateStudentForm(jsonDataForStudentForm);
		if (validationResult.isEmpty()) {
			try {
				StudentForm studentFormObj = studentFormService
						.saveStudentForm(StudentFormHelper.processSaveStudentFormRequestData(jsonDataForStudentForm));
				if (studentFormObj != null) {
					message.setMessage(SAVED_SUCCESSFULLY);
					message.setStatus(true);
					message.setObject(studentFormObj);
				} else {
					message.setMessage(ERROR_UNSUCCESS);
					message.setStatus(false);
				}
			} catch (Exception e) {
				if (logger.isDebugEnabled()) {
					logger.debug(StudentFormController.class + e.getLocalizedMessage());
				}
				message.setMessage(ERROR_EXCEPTION + e.getLocalizedMessage());
				message.setStatus(false);
			}

		} else {
			message.setMessage(VALIDATION_ERROR);
			message.setStatus(false);
			message.setObject(validationResult);

		}
		return message;
	}

	// updateStudentForm
	@RequestMapping(value = "/savestudentform", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody Message updateStudentForm(@RequestBody String jsonDataForStudentForm) {
		Message message = new Message();

		// validate jsonDataForStudentForm
		ArrayList<String> validationResult;
		validationResult = StudentFromValidator.validateUpdateStudentForm(jsonDataForStudentForm);
		if (validationResult.size() == 0) {
			try {
				StudentForm studentFormObj = studentFormService.updateStudentForm(
						StudentFormHelper.processUpdateStudentFormRequestData(jsonDataForStudentForm));
				if (studentFormObj != null) {
					message.setMessage(UPDATED_SUCCESSFULLY);
					message.setStatus(true);
					message.setObject(studentFormObj);
				} else {
					message.setMessage(ERROR_UNSUCCESS);
					message.setStatus(false);
				}
			} catch (Exception e) {
				if (logger.isDebugEnabled()) {
					logger.debug(StudentFormController.class + e.getLocalizedMessage());
				}
				message.setMessage(ERROR_EXCEPTION + e.getLocalizedMessage());
				message.setStatus(false);
			}

		} else {
			message.setMessage(VALIDATION_ERROR);
			message.setStatus(false);
			message.setObject(validationResult);
		}
		return message;
	}

	// getStudentFormById
	@RequestMapping(value = "/getstudentformbyid/{id}", method = RequestMethod.GET)
	public @ResponseBody Message getStudentFormById(@Valid @RequestParam("id") int id) {
		Message message = new Message();
		// validate jsonDataForStudentForm
		try {
			Optional<StudentForm> studentFormObj = studentFormService.getStudentFormById(id);
			if (studentFormObj.isPresent()) {
				message.setMessage(DATA_FOUND);
				message.setStatus(true);
				message.setObject(studentFormObj);
			} else {
				message.setMessage(NOT_FOUND);
				message.setStatus(false);
			}
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug(StudentFormController.class + e.getLocalizedMessage());
			}
			message.setMessage(ERROR_EXCEPTION + e.getLocalizedMessage());
			message.setStatus(false);
		}
		return message;
	}

//getStudentFormById
	@RequestMapping(value = "/deletestudentformbyid/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String deleteStudentFormById(@PathVariable("id") int id) {
//		Message message = new Message();
		
		// validate jsonDataForStudentForm
		try {
		studentFormService.deleteStudentFormById(id);
//			if (studentFormObj.isEmpty()) {
//				message.setMessage(DELETED_SUCCESSFULLY);
//				message.setStatus(true);
//				message.setObject(studentFormObj);
//			} else {
//				message.setMessage(DELETED_UNSUCCESSFUL);
//				message.setStatus(false);
//			}
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug(StudentFormController.class + e.getLocalizedMessage());
			}
//			message.setMessage(ERROR_EXCEPTION + e.getLocalizedMessage());
//			message.setStatus(false);
		}
			return DELETED_SUCCESSFULLY;	
	}
}
