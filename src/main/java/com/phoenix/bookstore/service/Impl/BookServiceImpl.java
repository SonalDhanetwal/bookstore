package com.phoenix.bookstore.service.Impl;

import com.phoenix.bookstore.model.vo.Book;
import com.phoenix.bookstore.repository.BookRepository;
import com.phoenix.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks()
    {
        List books = new ArrayList();
        bookRepository.findAll().forEach(books::add);
        System.out.println("books: "+books);
        return books;
    }
    @Override
    public void saveBook(Book book)
    {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
    System.out.println("Book deleted");
    bookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book)
    {
        System.out.println("Book udpated");
        bookRepository.save(book);
        return book;
    }
}
