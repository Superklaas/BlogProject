package be.vdab.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private int age;
    @OneToMany(mappedBy = "author",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private List<Post> posts = new ArrayList<>();
    @OneToMany(mappedBy = "author",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private Set<Comment> comments = new HashSet<>();

    public Author(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }
    public Author () {}

    public int getId() { return id; }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age; }
    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", posts=" + posts +
                ", comments=" + comments +
                '}';
    }
}

