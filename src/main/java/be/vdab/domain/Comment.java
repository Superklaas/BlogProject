package be.vdab.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private Date date;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Post post;

    public Comment(String text, Date date, Author author, Post post) {
        this.text = text;
        this.date = date;
        this.author = author;
        this.post = post;
    }
    public Comment() {};

    public int getId() {
        return id;
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
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", author=" + author +
                ", post=" + post +
                '}';
    }
}


