package service;

import javax.persistence.EntityManager;

import model.HFullTimeEmployee;

public class HFullTimeEmployeeService {
    EntityManager em;
    public HFullTimeEmployeeService(EntityManager em){
        this.em = em;
    }

    public HFullTimeEmployee createFullTimeEmployee(String name, int vacationDays, long salary){
        HFullTimeEmployee emp = new HFullTimeEmployee();
        emp.setName(name);
        emp.setVacationDays(vacationDays);
        emp.setSalary(salary);

        em.persist(emp);
        return emp;
        
    }
}
