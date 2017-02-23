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
 * Sort an ArrayList of Integer
 * @author JeffreyMiller
 */
public class CH11N11 {
    public static void main(String[] args) {
        System.out.println("Max value in an Array Program");
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 integers");
        int input;
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            intList.add(sc.nextInt());
        }
        sort(intList);
        for(Integer i : intList){
            System.out.print(i + " ");
        }
        
    }
    public static void sort(ArrayList<Integer> list){
        list.sort((integer, anotherInteger) -> integer.compareTo(anotherInteger));
        //Collections.sort(list);
    }
}
