/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH11N2;

/**
 *
 * @author Jeff
 */
public class Student extends Person{
    public final String FRESHMAN = "freshman";
    public final String SOPHOMORE = "sophomore";
    public final String JUNIOR = "junior";
    public final String SENIOR = "senior";
    
    private final String classStatus;

    public Student(String classStatus) {
        super();
        this.classStatus = classStatus;
    }
    
    public Student(String classStatus, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }    

    @Override
    public String toString() {
        return "Student" + getName();
    }
}
