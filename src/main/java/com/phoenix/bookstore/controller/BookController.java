package com.phoenix.bookstore.controller;

import com.phoenix.bookstore.model.vo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BookController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Book> getBooks();

    @RequestMapping(value = "/",method = RequestMethod.POST)
    void saveEachBook(@RequestBody Book b);

    @DeleteMapping("/{id}")
    void deleteEachBook(@PathVariable long id);

    @PutMapping(path="/")
    Book saveorUpdateBook(@RequestBody Book b);

}
