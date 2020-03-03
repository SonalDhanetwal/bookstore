package com.phoenix.bookstore.service;

import com.phoenix.bookstore.model.vo.Author;
import com.phoenix.bookstore.model.vo.Book;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    void saveBook(Book book);

    void deleteBook(long id);

    Book updateBook(Book book);

}
