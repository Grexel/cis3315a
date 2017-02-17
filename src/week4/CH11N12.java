/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Sum of values in an ArrayList
 * @author JeffreyMiller
 */
public class CH11N12 {
    public static void main(String[] args) {
        System.out.println("Sum of an ArrayList Program");
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int input;
        ArrayList<Double> doubleList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            doubleList.add(sc.nextDouble());
        }
        Double sum = sum(doubleList);
        System.out.println("Sum of numbers: " + sum);
        
    }
    public static Double sum(ArrayList<Double> list){
        Double sum = 0.0;
        for(Double i : list){
            sum += i;
        }
        return sum;
    }
    
}
