package com.phoenix.bookstore.service;

import com.phoenix.bookstore.model.vo.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    void saveAuthor();


    void deleteAuthor(long authorId);

    Author updateAuthor(Author author);
}
