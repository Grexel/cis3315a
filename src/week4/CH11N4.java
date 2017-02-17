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
 *  Maximum element in an ArrayList
 * @author JeffreyMiller
 */
public class CH11N4 {
    public static void main(String[] args) {
        System.out.println("Max value in an Array Program");
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers. Type 0 to end the sequence.");
        int input;
        ArrayList<Integer> intList = new ArrayList<>();
        while((input = sc.nextInt()) != 0){
            intList.add(input);
        }
        for(Integer i : intList){
            System.out.print(i + " ");
        }
        int maxValue = max(intList);
        System.out.println("");
        System.out.println("Max value is: " + maxValue);
    }
    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return null;
        }
        return Collections.max(list);
    }
}
