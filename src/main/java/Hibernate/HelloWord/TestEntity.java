package Hibernate.HelloWord;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import org.hibernate.cfg.Configuration;
import Hibernate.HelloWord.Message;

import javax.persistence.*;


public class TestEntity {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Message");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Message message = new Message();
        message.setText("Hello World!");
        em.persist(message);
        em.getTransaction().commit();
        em.close();
    }

}