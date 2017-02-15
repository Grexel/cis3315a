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
public class Staff extends Employee{
    private String title;

    public Staff(String title, String office, double salary, LocalDate dateHired) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String title, String office, double salary, LocalDate dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff" + getName();
    }
}
