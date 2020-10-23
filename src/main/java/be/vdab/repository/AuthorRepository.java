package be.vdab.repository;

import be.vdab.connection.EntityManagerProvider;
import be.vdab.domain.Author;

import javax.persistence.*;
import java.util.List;

public class AuthorRepository {

    private EntityManager em;

    public void createAuthor(Author author) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(author);
        tx.commit();
        em.close();
    }

    public Author readOneAuthor(int id) {
        em = EntityManagerProvider.getEM();
        Author author = em.find(Author.class,id);
        em.close();
        return author;
    }

    public List<Author> readListAuthors(String name) {
        em = EntityManagerProvider.getEM();
        Query query = em.createQuery("select a from Author a where a.name like '%" + name + "%'");
        List<Author> authorList = query.getResultList();
        em.close();
        return authorList;
    }

    public void updateAuthor(Author author) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Author dbAuthor = em.find(Author.class,author.getId());
        dbAuthor.setName(author.getName());
        dbAuthor.setLocation(author.getLocation());
        dbAuthor.setAge(author.getAge());
        dbAuthor.setPosts(author.getPosts());
        tx.commit();
        em.close();
    }

    public void deleteAuthor(Author author) {
        em = EntityManagerProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        author = em.find(Author.class,author.getId());
        em.remove(author);
        tx.commit();
        em.close();
    }

}


