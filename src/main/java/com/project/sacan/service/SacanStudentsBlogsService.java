package com.project.sacan.service;

import java.util.Optional;

import com.project.sacan.model.SacanStudentsBlogs;

public interface SacanStudentsBlogsService {

	// saveSacanStudentsBlogs
	public SacanStudentsBlogs saveSacanStudentsBlogs(SacanStudentsBlogs sacanStudentsBlogsObj) throws Exception;

	// updateSacanStudentsBlogs
	public SacanStudentsBlogs updateSacanStudentsBlogs(SacanStudentsBlogs sacanStudentsBlogsObj) throws Exception;

	// getSacanStudentsBlogsById
	public Optional<SacanStudentsBlogs> getSacanStudentsBlogsById(Long id) throws Exception;

	// deleteSacanStudentsBlogsById
	public void deleteSacanStudentsBlogsById(Long id) throws Exception;

}
