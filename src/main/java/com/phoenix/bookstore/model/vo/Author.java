package com.phoenix.bookstore.model.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorId", unique = true, nullable = false)
    private long authorId;
    String authorName;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Book> Books;
    /*private Set<Book> book;*/

    public Author(String authorName)
    {
        this.authorName = authorName;
    }

    public Author() {
    System.out.println("Default constructer");
    }


    public long getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public Set<Book> getBooks() {
        return Books;
    }

    public void setBooks(Set<Book> books) {
        Books = books;
    }
    }
