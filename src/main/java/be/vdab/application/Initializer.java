package be.vdab.application;

import be.vdab.connection.EntityManagerProvider;

import javax.persistence.EntityManager;

public class Initializer {
    public static void main(String[] args) {
        EntityManager em = EntityManagerProvider.getInitializer();
        em.close();
    }
}
