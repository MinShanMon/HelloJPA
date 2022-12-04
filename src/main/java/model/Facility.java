package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility {
    public Facility(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String description;

    public Facility(String name){
        this(name,null);
    }
    // public Facility(int id){
    //     this.id = id;
    // }
    public Facility(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public long getId(){
        return Id;
    }

    public void seId(int id){
        this.Id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        String fullName = name;
        if(description != null){
            fullName += "("+description+")";
        }
        return (fullName);
    }
}
