package com.example.rajspring.repository;

import com.example.rajspring.module.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookreposiory extends CrudRepository<Book,Integer> {

    int savebook(Book book);
}
