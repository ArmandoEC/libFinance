package com.armandoDev.util.connectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import org.hibernate.exception.ConstraintViolationException;

public class ConnectionFactory {

    private static EntityManagerFactory factory;
    private static EntityManager manager = null;
    private static EntityTransaction transaction;

    public static EntityManager getConnection() {

        if (factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory("libFinance");
        }

        if (manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }

        manager.clear();
        transaction = manager.getTransaction();

        return manager;

    }
    
    public static void begin() throws Exception {
        transaction = manager.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
    }

    public static void commit() throws Exception {
        transaction = manager.getTransaction();
        if (transaction.isActive()) {
            transaction.commit();
        }
    }

}
