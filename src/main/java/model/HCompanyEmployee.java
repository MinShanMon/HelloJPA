package model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class HCompanyEmployee extends Employee{
    private int vacationDays;

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
