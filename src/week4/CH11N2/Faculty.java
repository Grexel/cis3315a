/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH11N2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Jeff
 */
public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank, String office, double salary, LocalDate dateHired) {
        super(office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String office, double salary, LocalDate dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty" + getName();
    }
}
