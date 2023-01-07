package com.wrirech.wrirech.model.series;

import com.wrirech.wrirech.enums.Genres;
import com.wrirech.wrirech.model.actor.Actor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Series {
    @Id
    @GeneratedValue
    private Long id;
    private int runtime;
    @Enumerated(EnumType.STRING)
    private Genres genres;
    private String director;
    private int point;
    @ManyToOne
    private Actor actors;
    private String summary;
    private int chapter;
}
