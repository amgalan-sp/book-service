package com.example.bookservice.controller;

import com.example.bookservice.service.BookService;
import com.example.bookservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping
public class BooksController {
    Logger logger = Logger.getLogger(BooksController.class.getName());
    @Autowired
    private Environment env;
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String home() {
        String home = "Book-Service running at port: "  + env.getProperty("local.server.port");
        logger.info(home);
        return home;
    }

    @GetMapping(path = "/getAllBooks")
    public List<Book> getAllBooks() {
        logger.info("Get data from database (Feign Client on client-service side)");
        return bookService.findAllBooks();
    }
    @GetMapping("/data")
    public List<Book> data() {
        logger.info("Get data from database (RestTemplate on client-service side)");
        return bookService.findAllBooks();
    }
}
