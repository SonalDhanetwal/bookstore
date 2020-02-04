package com.phoenix.bookstore.controller.impl;

import com.phoenix.bookstore.controller.BookController;
import com.phoenix.bookstore.model.vo.Book;
import com.phoenix.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerImpl implements BookController {
    @Autowired
    BookService bookService;

    @Override
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Book> getBooks()
    {
        return bookService.getAllBooks();
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public void saveEachBook(@RequestBody Book b)
    {
        System.out.println("book name"+b.getBookName());
        System.out.println("book price"+b.getBookPrice());

        Book book = new Book();
        book.setBookName(b.getBookName());
        book.setBookPrice(b.getBookPrice());
        bookService.saveBook(book);
    }
}
