package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "capital")
public class Capital {
    @Id
    @Column(name="capital_id")
    private long id;
    private String name;
    @OneToOne(mappedBy="my_capital")
    private Country country;

    public Capital(long id, String name){
        this.id = id;
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    
    

}
