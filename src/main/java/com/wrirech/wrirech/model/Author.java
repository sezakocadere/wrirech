package com.wrirech.wrirech.model;

import com.wrirech.wrirech.model.book.Book;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String fullname;
    @ManyToOne
    private Book book;
    private Date birtdate;
}
