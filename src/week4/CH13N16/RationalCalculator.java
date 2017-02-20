/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH13N16;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class RationalCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rational Calculator");
        System.out.println("Enter a rational problem to solve");
        System.out.println("ex. 3/5 + 4/5");
        String expression = sc.nextLine();
        String[] expressionSplit = expression.split(" ");
        try{
            Rational r1 = Rational.parseString(expressionSplit[0]);
            Rational r2 = Rational.parseString(expressionSplit[2]);
            Rational result = null;
            String operator = expressionSplit[1];
            if(operator.equalsIgnoreCase("+")){
                result = r1.add(r2);
            }
            if(operator.equalsIgnoreCase("-")){
                result = r1.subtract(r2);
            }
            if(operator.equalsIgnoreCase("*")){
                result = r1.multiply(r2);
            }
            if(operator.equalsIgnoreCase("/")){
                result = r1.divide(r2);
            }
            if(result != null){
                System.out.println(expression + " = " + result);
            }
        }catch(Exception e){
            System.out.println("Input bad");
            System.out.println(e.getMessage());
        }
    }
}
