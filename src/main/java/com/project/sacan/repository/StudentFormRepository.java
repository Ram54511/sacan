package com.project.sacan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sacan.model.StudentForm;

public interface StudentFormRepository extends JpaRepository<StudentForm, Integer> {

}
