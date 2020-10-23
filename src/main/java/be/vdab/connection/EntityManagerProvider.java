package be.vdab.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

    public static EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("none");
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }

    public static EntityManager getInitializer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("create");
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }

}
