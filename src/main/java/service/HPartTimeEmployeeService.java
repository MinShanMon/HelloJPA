package service;

import javax.persistence.EntityManager;

import model.HPartTimeSmployee;

public class HPartTimeEmployeeService {
    EntityManager em;
    public HPartTimeEmployeeService(EntityManager em){
        this.em = em;
    }

    public HPartTimeSmployee createPartTimeEmployee(String name, int vacationDays, float houlyRate){
        HPartTimeSmployee emp = new HPartTimeSmployee();
        emp.setName(name);
        emp.setVacationDays(vacationDays);
        emp.setHoulyRate(houlyRate);

        em.persist(emp);
        return emp;

    }
}
