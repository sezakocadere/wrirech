package com.wrirech.wrirech.model.book;

import com.wrirech.wrirech.enums.Genres;
import com.wrirech.wrirech.model.Author;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Author author;
    @Enumerated(EnumType.STRING)
    private Genres genres;
}
