package service;

import javax.persistence.EntityManager;

import model.Capital;

public class CapitalService {
    protected EntityManager em;

    public CapitalService(EntityManager em){
        this.em = em;
    }

    public Capital createCapital(long id, String name){
        Capital capital = new Capital(id, name);
        em.persist(capital);
        return capital;
    }
}
