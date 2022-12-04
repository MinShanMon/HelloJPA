package service;

import javax.persistence.EntityManager;

import model.Circle;

public class CircleService {
    protected EntityManager em;

    public CircleService(EntityManager em){
        this.em = em;
    }

    public Circle createCapital(String color, double radius){
        Circle capital = new Circle(color, radius);
        em.persist(capital);
        return capital;
    }
}
