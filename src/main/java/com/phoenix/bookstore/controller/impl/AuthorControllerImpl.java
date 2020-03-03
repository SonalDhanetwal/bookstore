package com.phoenix.bookstore.controller.impl;

import com.phoenix.bookstore.controller.AuthorController;
import com.phoenix.bookstore.model.vo.Author;
import com.phoenix.bookstore.repository.AuthorRepository;
import com.phoenix.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author")
public class AuthorControllerImpl implements AuthorController {

    @Autowired
    AuthorService authorService;
    AuthorRepository authorRepository;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Author> getAuthors()
    {
        return authorService.getAllAuthors();
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public void saveEachAuthor(@RequestBody Author a)
    {
        authorService.saveAuthor();
//        authorService.saveAuthor(a);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.DELETE)
    public void deleteEachAuthor(@PathVariable long authorId)
    {
        authorService.deleteAuthor(authorId);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Author updateEachAuthor(@RequestBody Author a)
    {
        authorService.updateAuthor(a);
        return a;
    }
}
