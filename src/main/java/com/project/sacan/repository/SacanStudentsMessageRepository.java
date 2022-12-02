package com.project.sacan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sacan.model.SacanStudentsMessage;

public interface SacanStudentsMessageRepository extends JpaRepository<SacanStudentsMessage, Long> {

}
