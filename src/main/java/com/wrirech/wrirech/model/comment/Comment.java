package com.wrirech.wrirech.model.comment;

import com.sun.istack.NotNull;
import com.wrirech.wrirech.model.user.User;
import lombok.Data;

import javax.persistence.*;
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
    @ManyToOne
    private User user;

}
