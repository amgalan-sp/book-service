package com.example.bookservice.service;

import com.example.bookservice.repository.BooksRepository;
import com.example.bookservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Servo")
public class BookService {
    @Autowired
    private final BooksRepository booksRepository;

    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAllBooks() {
        return booksRepository.findAll();
    }

}
