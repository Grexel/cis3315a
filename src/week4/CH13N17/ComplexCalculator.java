/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH13N17;

import java.util.Scanner;
import week4.CH13N16.Rational;

/**
 *
 * @author JeffreyMiller
 */
public class ComplexCalculator {
    public static void main(String[] args) throws CloneNotSupportedException{
        Complex c1 = new Complex(3.5,5.5);
        Complex c2 = (Complex)c1.clone();
        System.out.println(c1 +"\n" + c2);
        c2.setRealPart(-3.5);
        c2.setImaginaryPart(1);
        System.out.println(c1 +"\n" + c2);
        Scanner sc = new Scanner(System.in);
        double real1, imaginary1;
        double real2, imaginary2;
        System.out.println("Complex Calculator");
        System.out.println("Enter a complex problem to solve as (real imaginary)");
        System.out.println("such as 3.5 5.5 for 3.5 + 5.5i");
        System.out.print("Enter the first complex number: ");
        real1 = sc.nextDouble();
        imaginary1 = sc.nextDouble();
        System.out.print("Enter the second complex number: ");
        real2 = sc.nextDouble();
        imaginary2 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println("|" + complex1 + "| = " + complex1.absolute());
    }
}