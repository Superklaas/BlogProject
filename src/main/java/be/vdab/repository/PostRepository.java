package be.vdab.repository;

import be.vdab.connection.EntityManagerProvider;
import be.vdab.domain.Post;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class PostRepository {

    private EntityManager em;

    public void createPost(Post post) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(post);
        tx.commit();
        em.close();
    }

    public Post readOnePost(int id) {
        em = EntityManagerProvider.getEM();
        Post post = em.find(Post.class,id);
        em.close();
        return post;
    }

    public List<Post> readListPosts(String title) {
        em = EntityManagerProvider.getEM();
        Query query = em.createQuery("select p from Post p where p.title like '%" + title + "%'");
        List<Post> postList = query.getResultList();
        em.close();
        return postList;
    }

    public void updatePost(Post post) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Post dbPost = em.find(Post.class,post.getId());
        dbPost.setTitle(post.getTitle());
        dbPost.setText(post.getText());
        dbPost.setDate(post.getDate());
        dbPost.setAuthor(post.getAuthor());
        tx.commit();
        em.close();
    }

    public void deletePost(Post post) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        post = em.find(Post.class,post.getId());
        em.remove(post);
        tx.commit();
        em.close();
    }

}
