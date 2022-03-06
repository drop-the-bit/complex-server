package com.server.java.repository;

import com.server.java.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    Page<User> findByNameContains(String name, Pageable pageable);
}
