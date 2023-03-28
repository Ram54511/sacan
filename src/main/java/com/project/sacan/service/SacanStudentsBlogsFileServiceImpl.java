package com.project.sacan.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sacan.dto.UploadFileDto;
import com.project.sacan.dto.UploadedJsonDto;
import com.project.sacan.model.SacanStudentsBlogsUploadFileModel;
import com.project.sacan.model.SacanStudentsBlogsUploadJsonModel;
import com.project.sacan.repository.UploadedFileRepository;
import com.project.sacan.repository.UploadedJsonRepository;

@Service
public class SacanStudentsBlogsFileServiceImpl implements SacanStudentBlogsFileService {

	@Autowired
	private UploadedFileRepository uploadedFileRepository;
	
	@Autowired
	private UploadedJsonRepository uploadedJsonRepository;

	@Override
	public boolean saveFile(UploadFileDto uploadedFileDto) {
		boolean uploaded = false;
		try {
			SacanStudentsBlogsUploadFileModel sacanStudentsBlogsUploadFileModel = new SacanStudentsBlogsUploadFileModel();
			sacanStudentsBlogsUploadFileModel.setFileName(uploadedFileDto.getFileName());
			sacanStudentsBlogsUploadFileModel.setData(uploadedFileDto.getFile().getBytes());
			uploadedFileRepository.save(sacanStudentsBlogsUploadFileModel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return uploaded;
	}

	@Override
	public List<SacanStudentsBlogsUploadFileModel> getAllFiles() {
		// TODO 
		return uploadedFileRepository.findAll();
	}

	@Override
	public SacanStudentsBlogsUploadFileModel getFileById(Long id) {
		// TODO Auto-generated method stub
		return uploadedFileRepository.getById(id);
	}

	@Override
	public void deleteFile(Long id) {
		uploadedFileRepository.deleteById(id);
	}
	
	@Override
	public boolean saveJson(UploadedJsonDto uploadedJsonDto) throws Exception{
		try {
			SacanStudentsBlogsUploadJsonModel sacanStudentsBlogsUploadJsonModel = new SacanStudentsBlogsUploadJsonModel();
			sacanStudentsBlogsUploadJsonModel.setStudentBlogInfo(uploadedJsonDto.getJson());
			uploadedJsonRepository.save(sacanStudentsBlogsUploadJsonModel);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

}
