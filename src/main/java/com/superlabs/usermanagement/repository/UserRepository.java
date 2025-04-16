package com.superlabs.usermanagement.repository;

import com.superlabs.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

	

	User findTopByOrderByIdDesc();
}

