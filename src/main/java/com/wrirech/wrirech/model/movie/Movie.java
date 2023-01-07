package com.wrirech.wrirech.model.movie;

import com.wrirech.wrirech.enums.Genres;
import com.wrirech.wrirech.model.actor.Actor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private int runtime;
    private Genres genres;
    private String director;
    private int point;
    @ManyToOne
    private Actor actors;
    private String summary;
}
