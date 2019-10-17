package com.kloudone.proj.bean;

import java.util.Collection;

public class PostBean {

    private Long id;
    private String title;
    private String body;

    private Collection<CommentBean> comments;

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


    public Collection<CommentBean> getComments() {
        return comments;
    }

    public void setComments(Collection<CommentBean> comments) {
        this.comments = comments;
    }
}
