package com.project.sacan.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
public class SacanStudentBlogsMultipartDto implements Serializable {

	/**
	 * Ram Thapa
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private MultipartFile file;
	private String documentTyp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getDocumentTyp() {
		return documentTyp;
	}

	public void setDocumentTyp(String documentTyp) {
		this.documentTyp = documentTyp;
	}

	public SacanStudentBlogsMultipartDto(Long id, MultipartFile file, String documentTyp) {
		super();
		this.id = id;
		this.file = file;
		this.documentTyp = documentTyp;
	}

	public SacanStudentBlogsMultipartDto() {
		super();
	}

}
