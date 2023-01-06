package com.wrirech.wrirech.model.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import com.wrirech.wrirech.enums.Gender;
import com.wrirech.wrirech.enums.Rank;
import com.wrirech.wrirech.enums.Status;
import com.wrirech.wrirech.model.book.Book;
import com.wrirech.wrirech.model.movie.Movie;
import com.wrirech.wrirech.model.series.Series;
import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    private String aboutMe;
    private String userPhoto; //type bakilacak
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull
    private OffsetDateTime createdDate;
    @Enumerated(EnumType.STRING)
    private Status status;
    private int friendNumber;
    private Movie favoriteMovie;
    private Series favoriteSeries;
    private Book favoriteBook;
    private int point;
    private Rank rank;
}
