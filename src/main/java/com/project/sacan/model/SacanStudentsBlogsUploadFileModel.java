package com.project.sacan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;

@Entity
@Table(name = "sacan_student_uploads_files")

public class SacanStudentsBlogsUploadFileModel implements SacanDbTableName {

	/**
	 * auther:Ram thapa
	 */
	@Id
	@Column(name = ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = BLOG_ID)
	private Integer blogId;

	@Column(name = FILE_NAME)
	private String FileName;

	@Column(name = DATA)
	private byte[] data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public SacanStudentsBlogsUploadFileModel(Long id, Integer blogId, String fileName, byte[] data) {
		super();
		this.id = id;
		this.blogId = blogId;
		FileName = fileName;
		this.data = data;
	}

	public SacanStudentsBlogsUploadFileModel() {
		
	}
}
