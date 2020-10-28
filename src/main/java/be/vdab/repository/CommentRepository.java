package be.vdab.repository;

import be.vdab.connection.EntityManagerProvider;
import be.vdab.domain.Comment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CommentRepository {

    EntityManager em;

    public void createComment(Comment comment) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(comment);
        tx.commit();
        em.close();
    }

    public List<Comment> readListComments(String text) {
        em = EntityManagerProvider.getEM();
        Query query = em.createQuery("select c from Comment c where c.text like '%" + text + "%'");
        List<Comment> commentList = query.getResultList();
        em.close();
        return commentList;
    }

    public void updateComment(Comment comment) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Comment dbComment = em.find(Comment.class,comment.getId());
        dbComment.setText(comment.getText());
        dbComment.setDate(comment.getDate());
        dbComment.setAuthor(comment.getAuthor());
        dbComment.setPost(comment.getPost());
        tx.commit();
        em.close();
    }

    public void deleteComment(Comment comment) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        comment = em.find(Comment.class,comment.getId());
        em.remove(comment);
        tx.commit();
        em.close();
    }

}
