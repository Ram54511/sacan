package com.project.sacan.validator;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sacan.model.SacanStudentsBlogs;
import com.project.sacan.utl.SacanJsonConstrants;
import com.project.sacan.utl.SacanModuleConstrants;

public class SacanStudentsBlogsValidator implements SacanJsonConstrants, SacanModuleConstrants{
	
	@SuppressWarnings("null")
	public static ArrayList<String> validateStudentForm(String jsonDataForSacanStudentsBlogs) {
		ArrayList<String> validateMessage = new ArrayList<String>();
		try {
			JsonObject convertedObject = new Gson().fromJson(jsonDataForSacanStudentsBlogs, JsonObject.class);
			
			if (!convertedObject.has(_BLOG_ID)) {
				validateMessage.add(BLOG_ID_KEY_MISSED);
			}else {
				SacanStudentsBlogs sacanStudentsBlogs = null; 
				Integer blogId = convertedObject.get(_BLOG_ID).getAsInt();
				if(blogId.equals(sacanStudentsBlogs.getBlogId())) {
					validateMessage.add(DUPLICATE_BLOG_ID);
				}
			}


			if (!convertedObject.has(_TITLE)) {
				validateMessage.add(TITLE_KEY_MISSED);
			}
			
			if (!convertedObject.has(_CONTENT)) {
				validateMessage.add(CONTENT_KEY_MISSED);
			}else {
				String content = convertedObject.get(_CONTENT).getAsString();
				if(content.length()<100) {
					validateMessage.add(CONTENT_VALIDATION);
				}
			}

			if (!convertedObject.has(_IMAGE)) {
				validateMessage.add(IMAGE_KEY_MISSED);
			}
		
		} catch (Exception ex) {
			validateMessage.add(SPECIFIED_KEY_NOT_FOUND + ex.getLocalizedMessage());

		}
		return validateMessage;
	}

}
