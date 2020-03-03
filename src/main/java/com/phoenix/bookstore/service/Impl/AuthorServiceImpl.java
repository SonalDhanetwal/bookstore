package com.phoenix.bookstore.service.Impl;

import com.phoenix.bookstore.model.vo.Author;
import com.phoenix.bookstore.model.vo.Book;
import com.phoenix.bookstore.repository.AuthorRepository;
import com.phoenix.bookstore.repository.BookRepository;
import com.phoenix.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;


    @Override
    public List<Author> getAllAuthors() {
    List author = new ArrayList();
    authorRepository.findAll().forEach(author::add);
    return author;
    }

    @Override
    @Transactional
    public void saveAuthor() {
    Author auth1 = new Author("Shiv Khera1");
        Set<Book> Book1 = new HashSet<>();
        Book1.add(new Book("You Can Win4", 400.00,auth1));
        Book1.add(new Book("You Can Win1",100.50,auth1));
        Book1.add(new Book("You Can Win2",200.50,auth1));
        Book1.add(new Book("You Can WIn3",300.50,auth1));
    auth1.setBooks(Book1);

    authorRepository.save(auth1);

    }

    @Override
    public void deleteAuthor(long authorId){
    authorRepository.deleteById(authorId);
    };

    @Override
    public Author updateAuthor(Author author)
    {
        authorRepository.save(author);
        return author;
    }
}
