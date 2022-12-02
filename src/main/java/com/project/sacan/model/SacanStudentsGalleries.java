package com.project.sacan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.sacan.utl.SacanDbTableName;

@Entity
@Table(name = "sacan_students_galleries")
public class SacanStudentsGalleries implements Serializable, SacanDbTableName {

	/**
	 * auther : Ram Thapa
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID)
	private Long id;

	@Column(name = GALLERIES_ID, unique = true)
	private Integer GalleriesId;

	@Column(name = IMAGE, nullable = true)
	private byte[] image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getGalleriesId() {
		return GalleriesId;
	}

	public void setGalleriesId(Integer galleriesId) {
		GalleriesId = galleriesId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public SacanStudentsGalleries(Long id, Integer galleriesId, byte[] image) {
		super();
		this.id = id;
		GalleriesId = galleriesId;
		this.image = image;
	}

	public SacanStudentsGalleries() {
		super();
		// TODO Auto-generated constructor stub
	}

}
