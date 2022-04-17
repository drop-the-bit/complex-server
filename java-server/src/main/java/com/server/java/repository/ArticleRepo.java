package com.server.java.repository;

import com.server.java.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article, String> {
    Page<Article> findByTitleContains(String title, Pageable pageable);
}
