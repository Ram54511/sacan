package com.project.sacan.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.sacan.model.SacanStudentsBlogs;
import com.project.sacan.repository.SacanStudentsBlogsRepository;

public class SacanStudentsBlogsServiceImpl implements SacanStudentsBlogsService {

	private static Logger logger = LoggerFactory.getLogger(SacanStudentsBlogsServiceImpl.class);

	SacanStudentsBlogsRepository sacanStudentsBlogsRepository;
	
	//saveSacanStudentsBlogs
	@Override
	public SacanStudentsBlogs saveSacanStudentsBlogs(SacanStudentsBlogs sacanStudentsBlogsObj) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug(SacanStudentsBlogsServiceImpl.class + "saveSacanStudentsBlogs");
		}
		SacanStudentsBlogs sacanStudentsBlogs = sacanStudentsBlogsRepository.save(sacanStudentsBlogsObj);
		return sacanStudentsBlogs;
	}
	
	
	//updateSacanStudentsBlogs
	@Override
	public SacanStudentsBlogs updateSacanStudentsBlogs(SacanStudentsBlogs sacanStudentsBlogsObj) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug(SacanStudentsBlogsServiceImpl.class + "updateSacanStudentsBlogs");
		}
		
		SacanStudentsBlogs sacanStudentsBlogs = sacanStudentsBlogsRepository.findById(sacanStudentsBlogsObj.getId()).orElseThrow(null);
		return sacanStudentsBlogs;
	}
	
	//getSacanStudentsBlogsById
	@Override
	public Optional<SacanStudentsBlogs> getSacanStudentsBlogsById(Long id) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug(SacanStudentsBlogsServiceImpl.class + "getSacanStudentsBlogsById");
		}
		return sacanStudentsBlogsRepository.findById(id);
		
	}
	
	//deleteSacanStudentsBlogsById
	@Override
	public void deleteSacanStudentsBlogsById(Long id) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug(SacanStudentsBlogsServiceImpl.class + "deleteSacanStudentsBlogsById");
		}
		
		sacanStudentsBlogsRepository.deleteById(id);

	}

}
