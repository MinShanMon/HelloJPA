package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PFEmp")
public class HPartTimeSmployee extends HCompanyEmployee{
    private float houlyRate;

    public float getHoulyRate() {
        return houlyRate;
    }

    public void setHoulyRate(float houlyRate) {
        this.houlyRate = houlyRate;
    }
}
