package com.project.sacan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;

//@Entity
//@Table(name = "sacan_photo_upload")
public class SacanStudentsPhotoUploadModel implements SacanDbTableName {
	private String name;
	private String url;
}
