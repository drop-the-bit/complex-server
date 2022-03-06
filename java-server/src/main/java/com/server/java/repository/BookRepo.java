package com.server.java.repository;

import com.server.java.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, String> {
    Page<Book> findByTitleContains(String title, Pageable pageable);
}
