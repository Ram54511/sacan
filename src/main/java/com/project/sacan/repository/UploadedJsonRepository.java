package com.project.sacan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sacan.model.SacanStudentsBlogsUploadJsonModel;

@Repository
public interface UploadedJsonRepository extends JpaRepository<SacanStudentsBlogsUploadJsonModel, Long>{

}
