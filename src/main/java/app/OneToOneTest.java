package app;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Capital;
import service.CapitalService;
import service.CountryService;

public class OneToOneTest {
    public static void main(String[] args){
        //oneToOne Demo Capital
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA01");
        EntityManager em = emf.createEntityManager();
        CapitalService cpService = new CapitalService(em);
        em.getTransaction().begin();
        Capital cap1 = cpService.createCapital(101, "Singapore");
        Capital cap2 =cpService.createCapital(102, "Beijing");
        Capital cap3 =cpService.createCapital(103, "WashingtonDC");
        em.getTransaction().commit();

        //oneToOne Demo Country
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("JPA01");
        EntityManager em1 = emf1.createEntityManager();
        CountryService cpService1 = new CountryService(em1);
        em1.getTransaction().begin();
        cpService1.createCountry(1, "Singapore1", cap1);
        cpService1.createCountry(2,"China",cap2);
        cpService1.createCountry(3,"US", cap3);
        em1.getTransaction().commit();;


        // EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("JPA01");
        // EntityManager em1 = emf1.createEntityManager();
        // CountryService cpService1 = new CountryService(em1);
        // em1.getTransaction().begin();
        // cpService1.createCountry(1, "Singapore1", new Capital(101, "Singapore"));
        // cpService1.createCountry(2,"China", new Capital(102,"Beijing"));
        // cpService1.createCountry(3,"US", new Capital(103, "WashingtonDc"));
        // em1.getTransaction().commit();;
    }
 
}
