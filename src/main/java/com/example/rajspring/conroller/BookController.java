package com.example.rajspring.conroller;

import com.example.rajspring.module.Book;
import com.example.rajspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService service;
    @GetMapping("/book")
    private List<Book>getallbook(){
        return service.getAllBooks();
    }
    @GetMapping("/book{id}")
    private Book  getbook(@PathVariable Integer id){
        return service.getBooksById(id);
    }
    @DeleteMapping("/book{id}")
    private void deletebook(@PathVariable Integer id){
        service.delete(id);
    }
    @PostMapping("/books")
    private int savebook(@RequestBody Book book){
        service.saveOrUpdate(book);
        return book.getBookid();
    }
    @PutMapping("/books")
    private  Book updatebook(@RequestBody Book book){
        service.saveOrUpdate(book);
        return book;
    }
}
