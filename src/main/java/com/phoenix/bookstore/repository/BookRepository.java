package com.phoenix.bookstore.repository;

import com.phoenix.bookstore.model.vo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
/*        --JpaRepository<Book, Long>*/
{
}
