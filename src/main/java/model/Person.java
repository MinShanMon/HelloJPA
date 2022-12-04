package model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    private String surname;
    private String firstName;
    private String secondName;

    public Person(){}
    public Person(String sname, String fname, String secname){
        this.surname=sname;
        this.firstName =fname;
        this.secondName = secname;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String name){
        this.surname = name;
    }

    public String fname(){
        return this.firstName;
    }

    public void setfName(String name){
        this.firstName = name;
    }

    public String getSecname(){
        return this.secondName;
    }

    public void setSecname(String name){
        this.secondName = name;
    }

    public String toString(){
        String fullName = firstName;
        if(secondName!=null){
            fullName += " "+ secondName;
        }
        fullName += " " + surname;
        return (fullName);
    }
}
