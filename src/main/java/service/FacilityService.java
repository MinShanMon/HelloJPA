package service;
import java.util.List;

import javax.persistence.*;

import model.Facility;

public class FacilityService {
    protected EntityManager em;
    
    public FacilityService(EntityManager em){
        this.em = em;
    }

    public Facility createFacility(String name, String description){
        Facility emp = new Facility(name, description);        
        em.persist(emp);
        
        return emp;
    }

    public Facility updateFacility(int id, String name, String description){
        Facility facility = findFacility(id);
        if(name != null){
            facility.setName(name);
        }
        if(description != null){
            facility.setDescription(description);
        }
        return facility;
    }

    public Facility findFacility(int id){
        return em.find(Facility.class, id);
    }

    public void removeFacility(int id){
        Facility facility = findFacility(id);
        if(facility!=null){
            em.remove(facility);
        }
    }

    public List<Facility> listAllFacilities(){
        String q = "SELECT f FROM Facility f";
        TypedQuery<Facility> query = em.createQuery(q, Facility.class);
        return query.getResultList();
    }
    
    public List<Facility> listFacilities(String name){
        String q = "SELECT f" + " FROM Facility f " + " WHERE f.name LIKE :name1";
        TypedQuery<Facility> query = em.createQuery(q, Facility.class).setParameter("name1", "%"+name+"%");
        return query.getResultList();
    }
}
