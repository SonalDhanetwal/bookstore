package com.phoenix.bookstore.service;

import com.phoenix.bookstore.model.vo.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    void saveBook(Book book);
}
