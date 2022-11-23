package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BooksRepository;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private final BooksRepository booksRepository;

    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public void  deleteAll() {
        booksRepository.deleteAll();
    }
    public void save(Book book){
        booksRepository.save(book);
    }
}
