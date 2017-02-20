/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH13N16;

/**
 *
 * @author Jeff
 */
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational add(Rational r){
        int resultNumerator = this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator();
        int resultDenominator = this.getDenominator() * r.getDenominator();
        Rational result = new Rational(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }
    public Rational subtract(Rational r){
        int resultNumerator = this.getNumerator() * r.getDenominator() - r.getNumerator() * this.getDenominator();
        int resultDenominator = this.getDenominator() * r.getDenominator();
        Rational result = new Rational(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }
    public Rational multiply(Rational r){
        int resultNumerator = this.getNumerator() * r.getNumerator();
        int resultDenominator = this.getDenominator() * r.getDenominator();
        Rational result = new Rational(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }
    public Rational divide(Rational r){
        int resultNumerator = this.getNumerator() * r.getDenominator();
        int resultDenominator = this.getDenominator() * r.getNumerator();
        Rational result = new Rational(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }
    public void simplify(){
        //find common divisor
        int greatestCommonDivisor = gcd(this.getNumerator(),this.getDenominator());
        
        this.setNumerator(this.getNumerator() / greatestCommonDivisor);
        this.setDenominator(this.getDenominator() / greatestCommonDivisor);
    }
    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    /**
     * helper function to find the greatest common divisor of a rational's
     * numerator and denominator. Euclids gcd.
     * @param m Numerator of Rational
     * @param n Denominator of Rational
     * @return greatest common divisor of Numerator and Denominator
     */
    public int gcd(int m, int n){
        //System.out.println("M: " + m + " N: " + n);
        if(n == 0){
            return m;
        }
        else{
            return gcd(n,m % n);
        }
    }
    
    /**
     * Attempts to create a Rational by decoding a String.
     * @param s String to parse into a Rational. Needs to be in "#/#" format
     * @return Rational created from String parameter, null if function fails
     */
    public static Rational parseString(String s){
        String[] split = s.split("/");
        try{
            int numerator = Integer.parseInt(split[0]);
            int denominator = Integer.parseInt(split[1]);
            return new Rational(numerator,denominator);
        }catch(Exception e){
            System.out.println("Rational.parseString(" + s + ") failed");
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public String toString() {
        return numerator + "/"+ denominator;
    }
    
    
    
}
