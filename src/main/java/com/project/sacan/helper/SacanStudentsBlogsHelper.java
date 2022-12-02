package com.project.sacan.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sacan.model.SacanStudentsBlogs;
import com.project.sacan.utl.SacanJsonConstrants;

public class SacanStudentsBlogsHelper implements SacanJsonConstrants {

	private static Logger logger = LoggerFactory.getLogger(SacanStudentsBlogsHelper.class);

	// processSaveStudentFormRequestData
	public static SacanStudentsBlogs processSaveSacanStudentsBlogsRequestData(String jsonDataForSacanStudentsBlogs) {
		SacanStudentsBlogs sacanStudentsBlogsObj = new SacanStudentsBlogs();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSacanStudentsBlogs, JsonObject.class);
			Integer blogId = convertedObject.get(_BLOG_ID).getAsInt();
			String title = convertedObject.get(_TITLE).getAsString();
			String content = convertedObject.get(_CONTENT).getAsString();

			sacanStudentsBlogsObj.setBlogId(blogId);
			sacanStudentsBlogsObj.setTitle(title);
			sacanStudentsBlogsObj.setContent(content);

		} catch (Exception ex) {
			if (logger.isDebugEnabled()) {
				logger.debug(SacanStudentsBlogsHelper.class + ex.getLocalizedMessage());
			}
		}
		return sacanStudentsBlogsObj;
	}

}
