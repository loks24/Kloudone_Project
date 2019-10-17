package com.kloudone.proj.entity;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "title", nullable = false)
    @Length(min = 5, message = "*Your title must have at least 5 characters")
    @NotEmpty(message = "*Please provide title")
    private String title;

    @Column(name = "body", columnDefinition = "TEXT")
    private String body;

   
    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private Collection<CommentEntity> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public Collection<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Collection<CommentEntity> comments) {
        this.comments = comments;
    }
}