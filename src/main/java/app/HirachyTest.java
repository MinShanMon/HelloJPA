package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import service.HFullTimeEmployeeService;
import service.HPartTimeEmployeeService;

public class HirachyTest {
    public static void main(String[] args){
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("JPA01");
        EntityManager em = emf.createEntityManager();

        HFullTimeEmployeeService FEService = new HFullTimeEmployeeService(em);
        HPartTimeEmployeeService PEService = new HPartTimeEmployeeService(em);

        em.getTransaction().begin();
        FEService.createFullTimeEmployee("Oscar", 1, 1000);
        PEService.createPartTimeEmployee("w", 12, 199);
    }
}
