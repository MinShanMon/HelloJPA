package service;

import javax.persistence.EntityManager;

import model.Call;
import model.MobilePhone;

public class CallService {
    EntityManager em;
    public CallService(EntityManager em){
        this.em = em;
    }

    public Call createCall(int duration, MobilePhone ml){
        Call call = new Call(duration, ml);
        em.persist(call);
        return call;
    }


    public Call createCall(int duration){
        Call call = new Call(duration);
        em.persist(call);
        return call;
    }
}
