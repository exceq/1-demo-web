package com.example.demoweb.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes = 0;
    Date creationDate;

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
}
