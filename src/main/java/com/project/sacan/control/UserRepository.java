package com.project.sacan.control;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, Long> {
	
	Optional<UserRepository> findByEmail(String email);
	Optional<UserRepository> findByUserOrEmail(String username, String email);
	Optional<UserRepository> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
