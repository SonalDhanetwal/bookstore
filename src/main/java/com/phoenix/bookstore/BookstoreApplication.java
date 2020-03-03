package com.phoenix.bookstore;

import java.util.List;

import com.phoenix.bookstore.model.vo.Author;
import com.phoenix.bookstore.service.AuthorService;
import com.phoenix.bookstore.service.Impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner
{

	@Autowired
	AuthorServiceImpl authService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);

	}

	@Override
	@Transactional
	public void run(String... args) throws Exception
	{
		authService.saveAuthor();
	}

}
