package com.phoenix.bookstore.controller;

import com.phoenix.bookstore.model.vo.Author;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface AuthorController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<Author> getAuthors();

    @RequestMapping(value = "/",method = RequestMethod.POST)
    void saveEachAuthor(@RequestBody Author a);

    @RequestMapping(value = "/",method = RequestMethod.DELETE)
    void deleteEachAuthor(@PathVariable long authorId);

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    Author updateEachAuthor(@RequestBody Author a);
}
