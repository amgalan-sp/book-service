package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        bookService.deleteAll();
        bookService.save(new Book("1", "Java", "OOP","http://infopulse-univer.com.ua/images/trenings/java.png"));
        bookService.save(new Book("2", "Java", "Steram API","https://www.hdwallpaperslife.com/wp-content/uploads/2018/09/JAVA14-480x270.png"));
        bookService.save(new Book("3", "Java", "Collections","https://i.ytimg.com/vi/oOOESCvGGcI/hqdefault.jpg"));
        bookService.save(new Book("4", ".NET", "Basic","https://upload.wikimedia.org/wikipedia/commons/0/0e/Microsoft_.NET_logo.png"));
        bookService.save(new Book("5", "C++", "Basic","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmgIz9Ug-MVzBQJMcgXedOXTqHWGmbSu5pPDivz8hrfo_GE0HZEA"));
        bookService.save(new Book("6", "JavaScript", "Angular 8","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg41zepuyHbew8bIsTYeKWJ9RYOnnV922lNa85-fQTVrKDG19K2w"));

    }
}