/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Combine 2 ArrayLists
 * @author JeffreyMiller
 */
public class CH11N14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Union of 2 ArrayLists Program");
        System.out.println("-----------------------------");
        System.out.println("Enter 5 integers for list1: ");
        for(int i = 0; i < 5; i++){
            list1.add(sc.nextInt());
        }
        System.out.println("Enter 5 integers for list2: ");
        for(int i = 0; i < 5; i++){
            list2.add(sc.nextInt());
        }
        ArrayList<Integer> unionList = union(list1,list2);
        System.out.println("The combined list is: ");
        for(Integer i : unionList){
            System.out.print(i + " ");
        }
        System.out.println("");
        
    }
    public static ArrayList<Integer> union(
            ArrayList<Integer> list, ArrayList<Integer> list2){
        ArrayList<Integer> unionList = new ArrayList<>();
        unionList.addAll(list);
        unionList.addAll(list2);
        return unionList;
    }
    
    
}
