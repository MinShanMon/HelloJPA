package app;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import service.CircleService;

public class MappedSuperclassTest {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA01");
        EntityManager em = emf.createEntityManager();

        CircleService cService = new CircleService(em);
        em.getTransaction().begin();   
        cService.createCapital("GregorianCalendar", 3);
        em.getTransaction().commit();
    }
}
