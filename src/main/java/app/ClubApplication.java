package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Capital;
import model.Employee;
import model.Facility;
import service.CapitalService;
import service.CountryService;
import service.EmployeeService;
import service.FacilityService;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClubApplication {

    public static void main(String[] args){
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("JPA01");
        EntityManager em = emf.createEntityManager();
        EmployeeService service = new EmployeeService(em);

        // Create and persist an employee
        em.getTransaction().begin();
        Employee emp = service.createEmployee(159, "Emily Tan", 55000);
        em.getTransaction().commit();
        System.out.println("Persisteed " + emp);

        // Find all employees
        List<Employee> emps = service.findAllEmployees();
        for (Employee e : emps) {
            System.out.println("Found employee: " + e);
        }

        // Update an employee
        em.getTransaction().begin();
        Employee updatedEmp = service.raiseEmployeeSalary(158, 3000);
        em.getTransaction().commit();
        System.out.println("Updated " + updatedEmp);

        // Find an employee
        Employee e = service.findEmployee(158);
        System.out.println("Found employee: " + e);



        // Facilitytest
        // EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("JPA01");
        // EntityManager em1 = emf1.createEntityManager();
        // FacilityService service1 = new FacilityService(em1);
        // em1.getTransaction().begin();
        // Facility fc = service1.createFacility("Oscar", "Professional");
        // em1.getTransaction().commit();
        // System.out.println("Persisteed" + fc);
        

   


        //  EntityManagerFactory emf = 
        //     Persistence.createEntityManagerFactory("JPA01");
        // EntityManager em = emf.createEntityManager();
        // EntityManager em1 = emf.createEntityManager();
        // FacilityService service = new FacilityService(em);
        // FacilityService serv = new FacilityService(em);
        
        // Create and persist an employee
        // em.getTransaction().begin();
        // Facility emp = service.createFacility("oscar Emily", "pro1");
        // service.createFacility("Emily oscar", "pro21");
        // service.createFacility("Emily", "pro231");
        // service.updateFacility(3, "oscar", "so nice");
        // serv.createFacility("bae", "thel");
        // Facility emp = service.findFacility(3);
        // List<Facility> ems = service.listAllFacilities(); 
        // List<Facility> ems = service.listFacilities("Emily");
        // em.getTransaction().commit();
        // System.out.println("Persisteed " + emp);
        // for(Facility f: ems){
        //     System.out.println("per: "+f);
        // }

 

        
    }
}
