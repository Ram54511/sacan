package com.project.sacan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sacan.dto.UploadedJsonDto;
import com.project.sacan.model.SacanStudentsBlogsUploadJsonModel;
import com.project.sacan.repository.UploadedJsonRepository;

@Service
public class UploadedJsonServiceImpl implements UploadedJsonService {

	@Autowired
	private UploadedJsonRepository uploadedJsonRepository;

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
