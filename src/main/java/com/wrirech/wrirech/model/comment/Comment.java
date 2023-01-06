package com.wrirech.wrirech.model.comment;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.OffsetDateTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private int point;
    @NotNull
    private OffsetDateTime createdDate;
    @NotNull
    private String title;
    @NotNull
    private String detail;
    @ManyToOne
    private Comment subComment;

}
