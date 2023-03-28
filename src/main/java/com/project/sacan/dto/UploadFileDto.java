package com.project.sacan.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileDto {
	private String fileName;
	private MultipartFile file;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public UploadFileDto(String fileName, MultipartFile file) {
		super();
		this.fileName = fileName;
		this.file = file;
	}

	public UploadFileDto() {

	}

}
