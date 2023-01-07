package com.wrirech.wrirech.model.actor;

import com.wrirech.wrirech.model.movie.Movie;
import com.wrirech.wrirech.model.series.Series;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class Actor {
    @Id
    @GeneratedValue
    private Long id;
    private String fullname;
    private Date birtdate;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Series series;
    private String about;
}
