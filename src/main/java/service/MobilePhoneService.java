package service;

import javax.persistence.EntityManager;


import model.MobilePhone;
import java.util.List;
import model.Call;

public class MobilePhoneService {
    EntityManager em;
    public MobilePhoneService(EntityManager em){
        this.em = em;

    }

    public MobilePhone creatMobilePhone(String number){
        MobilePhone mobilePhone = new MobilePhone(number);
        em.persist(mobilePhone);
        return mobilePhone;
    }

    
    public MobilePhone creatMobilePhone(String number, List<Call> calls){
        MobilePhone mobilePhone = new MobilePhone(number, calls);
        em.persist(mobilePhone);
        return mobilePhone;
    }


}
