package service;

import javax.persistence.EntityManager;

import model.Capital;
import model.Country;

public class CountryService {
    protected EntityManager em;

    public CountryService(EntityManager em){
        this.em = em;        
    }

    public Country createCountry(long id, String name, Capital cap1){
        Country country = new Country(id, name, cap1);
        em.persist(country);
        return country;
    }
}
