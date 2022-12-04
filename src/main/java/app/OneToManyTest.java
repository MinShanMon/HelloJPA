package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.MobilePhone;
import service.CallService;
import service.MobilePhoneService;
import java.util.*;
import model.Call;
public class OneToManyTest {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA01");
        EntityManager em = emf.createEntityManager();

        MobilePhoneService mpService = new MobilePhoneService(em);
        CallService callService= new CallService(em);
        em.getTransaction().begin();   
        
        // List<Call> calls=new ArrayList<>();
        // calls.add(new Call(12312));
        // calls.add(new Call(312));
        // calls.add(new Call(3094));

        MobilePhone mb1 = mpService.creatMobilePhone("19203123");
        MobilePhone mb2 = mpService.creatMobilePhone("9389123");
        MobilePhone mb3 = mpService.creatMobilePhone("13912309123");
        callService.createCall(124, mb1);
        callService.createCall(99, mb1);
        callService.createCall(293, mb1);
        callService.createCall(192, mb2);
        callService.createCall(123, mb3);
        em.getTransaction().commit();


        // CallService callService = new CallService(em);
        // em.getTransaction().begin();
        
        
        // em.getTransaction().commit();
        em.refresh(mb1);
        List<Call> callss=mb1.getCalls();
        for(Call c: callss){
            System.out.println(c);
        }
    }
}
