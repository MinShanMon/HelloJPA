package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country2")
public class Country {
    @Id
    private long id;
    private String name;
    @OneToOne
    // @JoinColumn(name = "my_capital_id")
    private Capital my_capital;

    public Country(long id, String name, Capital i){
        this.id = id;
        this.name = name;
        this.my_capital = i;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Capital getCapital() {
        return my_capital;
    }
    public void setCapital(Capital capital) {
        this.my_capital = capital;
    }
}
