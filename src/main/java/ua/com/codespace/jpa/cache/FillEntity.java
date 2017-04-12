package ua.com.codespace.jpa.cache;

import ua.com.codespace.jpa.cache.model.MySuperEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class FillEntity {

    public static void main(String[] args) {
        MySuperEntity entity1 = new MySuperEntity("value1", Arrays.asList("10", "11"));
        MySuperEntity entity2 = new MySuperEntity("value2", Arrays.asList("20", "21"));
        MySuperEntity entity3 = new MySuperEntity("value3", Arrays.asList("30", "31"));
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("h2-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity1);
        entityManager.persist(entity2);
        entityManager.persist(entity3);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
