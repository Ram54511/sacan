package com.project.sacan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.sacan.dto.UploadFileDto;
import com.project.sacan.dto.UploadedJsonDto;
import com.project.sacan.message.Message;
import com.project.sacan.service.SacanStudentBlogsFileService;
import com.project.sacan.utl.CommanMessage;
import com.project.sacan.service.UploadedJsonService;

@RestController
@RequestMapping(value = "/api")
public class SacanStudentsBlogsController implements CommanMessage {
	private static Logger logger = LoggerFactory.getLogger(StudentFormController.class);

	@Autowired
	private SacanStudentBlogsFileService sacanStudentBlogsFileService;
	
//	@Autowired
//	private UploadedJsonService UploadedJsonService;
	
	@RequestMapping(value = "/savestudentblog", method = RequestMethod.POST, consumes = { "multipart/form-data", "application/json" })
	public @ResponseBody String saveStudentForm(@RequestParam MultipartFile file, @RequestParam String json) throws Exception {
		
		Message message = new Message();
		UploadFileDto uploadFileDto = new UploadFileDto();
		uploadFileDto.setFileName(file.getOriginalFilename());
		uploadFileDto.setFile(file);
		
		UploadedJsonDto uploadedJsonDto  = new UploadedJsonDto();
		uploadedJsonDto.setJson(json);
		
		
		boolean fileUploaded  = sacanStudentBlogsFileService.saveFile(uploadFileDto);
		boolean jsonUploaded = sacanStudentBlogsFileService.saveJson(uploadedJsonDto);
		
		 if (fileUploaded && jsonUploaded) {
	           // return ResponseEntity.ok().body("Files uploaded successfully.");
			 return "file upload";
	            
	        } else {
	        	return "Sorry";
	           // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload files.");
	        }
		
		
	}

}
