package com.phoenix.bookstore.repository;

import com.phoenix.bookstore.model.vo.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
