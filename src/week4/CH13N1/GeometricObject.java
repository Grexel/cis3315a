/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH13N1;

import java.time.LocalDate;

/**
 * Implementation of GeometricObject for other shapes to inherit from.
 * @author JeffreyMiller
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private LocalDate dateCreated;
    protected GeometricObject(){
        dateCreated = LocalDate.now();
    }
    protected GeometricObject(String color, boolean filled){
        dateCreated = LocalDate.now();
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString(){
        return "created on " + dateCreated.toString() 
                + "\ncolor" + color + " filled: " + filled;
    }
}
