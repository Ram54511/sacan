package com.project.sacan.control;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<RolesRepository, Long> {
	Optional<RolesRepository> findByName(String name);

}
