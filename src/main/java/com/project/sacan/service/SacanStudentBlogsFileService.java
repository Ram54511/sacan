package com.project.sacan.service;

import java.util.List;

import com.project.sacan.dto.UploadFileDto;
import com.project.sacan.dto.UploadedJsonDto;
import com.project.sacan.model.SacanStudentsBlogsUploadFileModel;

public interface SacanStudentBlogsFileService {

	boolean saveFile(UploadFileDto uploadedFileDto);

	List<SacanStudentsBlogsUploadFileModel> getAllFiles();

	SacanStudentsBlogsUploadFileModel getFileById(Long id);

	void deleteFile(Long id);
	
	boolean saveJson(UploadedJsonDto uploadedJsonDto) throws Exception;
}
