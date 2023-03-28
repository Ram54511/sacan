package com.project.sacan.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.project.sacan.utl.SacanDbTableName;

public class SacanStudentsBlogsUploadJsonModel implements SacanDbTableName {
	/**
	 * auther:Ram thapa
	 */
	@Id
	@Column(name = ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = BLOG_ID)
	private Integer blogId;

	@Column(name = STUDENT_BLOG_INFO)
	private String studentBlogInfo;

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

	public String getStudentBlogInfo() {
		return studentBlogInfo;
	}

	public void setStudentBlogInfo(String studentBlogInfo) {
		this.studentBlogInfo = studentBlogInfo;
	}

	public SacanStudentsBlogsUploadJsonModel(Long id, Integer blogId, String studentBlogInfo) {
		super();
		this.id = id;
		this.blogId = blogId;
		this.studentBlogInfo = studentBlogInfo;
	}

	public SacanStudentsBlogsUploadJsonModel() {
		
	}
	
	
	

}
