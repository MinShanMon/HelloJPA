package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Calls")
public class Call {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private int id;
    private long duration;
    @ManyToOne
    private MobilePhone mobilePhone;

    public Call(long duration){
        this.duration = duration;
    }
    public Call(long duration, MobilePhone mobile){
        this(duration);
        this.mobilePhone = mobile;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getDuration() {
        return duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
}
