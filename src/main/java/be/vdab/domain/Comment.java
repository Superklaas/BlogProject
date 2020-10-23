package be.vdab.domain;

import java.util.Date;

public class Comment {

    private int id;
    private String text;
    private Date date;
    private Author author;
    private Post post;

    public Comment() {};
    public Comment(String text, Date date, Author author, Post post) {
        this.text = text;
        this.date = date;
        this.author = author;
        this.post = post;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Post getPost() {
        return post;
    }
    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "On " + date + ", " + author.getName() + " commented: '" + text + "'";
    }
}


