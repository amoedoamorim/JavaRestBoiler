package com.amoedoamorim.javarestboiler.dao.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

    private static EntityManagerFactory entityManagerFactory;

    static public void init() {
        if ((entityManagerFactory == null) || !entityManagerFactory.isOpen()) {
            entityManagerFactory = Persistence.createEntityManagerFactory("hibernate.jpa");
        }
    }

    static public void close() {
        if ((entityManagerFactory != null) || entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

    static public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
