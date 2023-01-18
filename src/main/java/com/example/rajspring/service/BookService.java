package com.example.rajspring.service;

import com.example.rajspring.module.Book;
import com.example.rajspring.repository.Bookreposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
@Autowired
    private Bookreposiory bookreposiory;

    public List<Book> getAllBooks()
    {
        List<Book> books = new ArrayList<Book>();
        bookreposiory.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
    public Book getBooksById(int id)
    {
        return bookreposiory.findById(id).get();
    }

    public void saveOrUpdate(Book books)
    {
        bookreposiory.save(books);
    }
    public void delete(int id)
    {
        bookreposiory.deleteById(id);
    }
    public void update(Book books, int bookid)
    {
        bookreposiory.save(books);
    }

}
