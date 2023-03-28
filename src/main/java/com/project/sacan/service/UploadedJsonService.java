package com.project.sacan.service;

import com.project.sacan.dto.UploadedJsonDto;

public interface UploadedJsonService {

	boolean saveJson(UploadedJsonDto uploadedJsonDto) throws Exception;

}
