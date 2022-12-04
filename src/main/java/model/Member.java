package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Members")
public class Member extends Person{
    @Id
    @GeneratedValue
    private int id;

    private int memberNumber;

    public Member(){}

    public Member(String surName, String fname, String secName, int memberNumber){
        super(surName, fname,secName);
        this.memberNumber = memberNumber;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public int getmemberNumber(){
        return this.memberNumber;
    }

    public void setMemberNumber(int name){
        this.memberNumber =name;
    }

    public String toString(){
        return (memberNumber + "-"+super.toString());
    }


}
