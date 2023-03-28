package com.project.sacan.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sacan.model.SacanStudentsBlogsUploadFileModel;

@Repository

public interface UploadedFileRepository extends JpaRepository<SacanStudentsBlogsUploadFileModel, Long> {

}
