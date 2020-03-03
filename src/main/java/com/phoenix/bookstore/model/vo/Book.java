package com.phoenix.bookstore.model.vo;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String bookName;
    Double bookPrice;

    @ManyToOne
    @JoinColumn(name = "author_Id")
    private Author author;

    public Book ()
    {
     System.out.println("Default Constructer");
    }
    public Book(String bookName, Double bookPrice,Author author)
    {
        this.bookName=bookName;
        this.bookPrice=bookPrice;
        this.author=author;
    }
    public Double getBookPrice() {
        return bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    }

