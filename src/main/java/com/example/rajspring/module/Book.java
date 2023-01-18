package com.example.rajspring.module;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Getter
@ToString
@Setter
public class Book {
    @Id
    private Integer bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;
}
