/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH13N17;

/**
 *
 * @author JeffreyMiller
 */
public class Complex {
    private double realPart;
    //the b of bi where i = sqrt(-1)
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(double real) {
        this.realPart = real;
        this.imaginaryPart = 0;
    }

    public Complex(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }
    public Complex add(Complex complex2){
        double newReal = this.getRealPart() + complex2.getRealPart();
        double newImaginary = this.getImaginaryPart() + complex2.getImaginaryPart();
        return new Complex(newReal,newImaginary);
    }
    public Complex subtract(Complex complex2){
        double newReal = this.getRealPart() - complex2.getRealPart();
        double newImaginary = this.getImaginaryPart() - complex2.getImaginaryPart();
        return new Complex(newReal,newImaginary);
    }
    public Complex multiply(Complex complex2){
        double newReal = this.getRealPart() * complex2.getRealPart() 
                - this.getImaginaryPart()*complex2.getImaginaryPart();
        double newImaginary = this.getRealPart() * complex2.getImaginaryPart()
                + this.getImaginaryPart() * complex2.getRealPart();
        return new Complex(newReal,newImaginary);
    }
    public Complex divide(Complex complex2){
        double cdSquare = complex2.getRealPart() * complex2.getRealPart()
                + complex2.getImaginaryPart() * complex2.getImaginaryPart();
        
        double newReal = (this.getRealPart() * complex2.getRealPart() 
                + this.getImaginaryPart()*complex2.getImaginaryPart()) / cdSquare;
        double newImaginary = (this.getImaginaryPart() * complex2.getRealPart()
                - this.getRealPart() * complex2.getImaginaryPart()) / cdSquare;
        return new Complex(newReal,newImaginary);
    }
    public double absolute(){
        return Math.sqrt(this.getRealPart()*this.getRealPart() 
                + this.getImaginaryPart() * this.getImaginaryPart());
    }
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return "(" + getRealPart() + " + " + getImaginaryPart() + "i)";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
            return new Complex(this.getRealPart(),this.getImaginaryPart());
    }
}
