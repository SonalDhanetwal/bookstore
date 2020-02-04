package com.phoenix.bookstore.controller;

import com.phoenix.bookstore.model.vo.Book;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface BookController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Book> getBooks();

    @RequestMapping(value = "/",method = RequestMethod.POST)
    void saveEachBook(@RequestBody Book b);
}
