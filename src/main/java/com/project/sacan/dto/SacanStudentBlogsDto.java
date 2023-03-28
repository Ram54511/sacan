package com.project.sacan.dto;

import java.io.Serializable;

public class SacanStudentBlogsDto implements Serializable {

	/**
	 * Ram Thapa
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer blogId;
	private String title;
	private String content;
	private SacanStudentBlogsMultipartDto sacanStudentBlogsMultipartDto;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SacanStudentBlogsMultipartDto getSacanStudentBlogsMultipartDto() {
		return sacanStudentBlogsMultipartDto;
	}

	public void setSacanStudentBlogsMultipartDto(SacanStudentBlogsMultipartDto sacanStudentBlogsMultipartDto) {
		this.sacanStudentBlogsMultipartDto = sacanStudentBlogsMultipartDto;
	}

	public SacanStudentBlogsDto(Long id, Integer blogId, String title, String content,
			SacanStudentBlogsMultipartDto sacanStudentBlogsMultipartDto) {
		super();
		this.id = id;
		this.blogId = blogId;
		this.title = title;
		this.content = content;
		this.sacanStudentBlogsMultipartDto = sacanStudentBlogsMultipartDto;
	}

	@Override
	public String toString() {
		return "SacanStudentBlogsDto [id=" + id + ", blogId=" + blogId + ", title=" + title + ", content=" + content
				+ ", sacanStudentBlogsMultipartDto=" + sacanStudentBlogsMultipartDto + "]";
	}

	public SacanStudentBlogsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
