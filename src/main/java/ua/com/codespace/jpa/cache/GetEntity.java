package ua.com.codespace.jpa.cache;

import ua.com.codespace.jpa.cache.model.MySuperEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("h2-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        MySuperEntity entity1 = entityManager.find(MySuperEntity.class, 21);
        System.out.println(entity1);
        entityManager.getTransaction().commit();
        System.out.println(entityManager.find(MySuperEntity.class, 21));
        /*Object entity = entityManager.createQuery("select entity from MySuperEntity entity where entity.id=:id")
                .setParameter("id", 21)
                .getSingleResult();
        System.out.println(entity);*/
        entityManager.close();
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        System.out.println(entityManager.find(MySuperEntity.class, 21));
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
