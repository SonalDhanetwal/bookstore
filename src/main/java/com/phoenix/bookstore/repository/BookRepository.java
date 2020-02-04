package com.phoenix.bookstore.repository;

import com.phoenix.bookstore.model.vo.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
