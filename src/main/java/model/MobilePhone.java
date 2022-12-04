package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.ArrayList;

@Entity
public class MobilePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;
    @OneToMany(mappedBy="mobilePhone")
    private List<Call> calls;

    public MobilePhone(){
        calls = new ArrayList<>();
    }
    public MobilePhone(String number){
        this.number = number;
    }
    public MobilePhone(String number, List<Call> call){
        this(number);
        this.calls = call;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public List<Call> getCalls() {
        return calls;
    }
    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }


}
