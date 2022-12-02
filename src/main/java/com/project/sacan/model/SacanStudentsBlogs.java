package com.project.sacan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;

@Entity
@Table(name = "sacan_student_blogs")

public class SacanStudentsBlogs implements Serializable, SacanDbTableName {

	/**
	 *auther:Ram thapa  
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = BLOG_ID, unique = true, nullable = false)
	private Integer blogId;

	@Column(name = TITLE, unique = true, nullable = false)
	private String title;

	@Column(name = CONTENT, unique = true, nullable = false)
	private String content;

//	@Column(name = TYPE, unique = true, nullable = false)
//	private String type;

	@Column(name = IMAGE, unique = true, nullable = false)
	private byte[] image;

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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public SacanStudentsBlogs(Long id, Integer blogId, String title, String content, byte[] image) {
		super();
		this.id = id;
		this.blogId = blogId;
		this.title = title;
		this.content = content;
		this.image = image;
	}

	public SacanStudentsBlogs() {
		super();

	}

}
