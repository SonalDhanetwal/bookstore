package com.phoenix.bookstore.controller.impl;

import com.phoenix.bookstore.controller.BookController;
import com.phoenix.bookstore.model.vo.Book;
import com.phoenix.bookstore.repository.BookRepository;
import com.phoenix.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerImpl implements BookController {
    @Autowired
    BookService bookService;
    BookRepository repo;

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
        /*book.setBookName(b.getBookName());
        book.setBookPrice(b.getBookPrice());*/
        bookService.saveBook(book);
    }
    @DeleteMapping("/{id}")
    public void deleteEachBook(@PathVariable long id)
    {
        Book b = new Book();
        bookService.deleteBook(id);
    }

    @PutMapping(path="/")
    public Book saveorUpdateBook(@RequestBody Book b)
    {
        bookService.updateBook(b);
        return b;
    }
}
