/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.util.Random;
import java.util.Scanner;

/**
 * Captures an ArrayIndexOutOfBoundsException
 * @author JeffreyMiller
 */
public class CH12N3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randInts = new int[100];
        for(int i = 0; i < 100; i++){
            randInts[i] = rand.nextInt();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index to access: ");
        int arrayIndex = sc.nextInt();
        try{
            System.out.println("Value at index: " + arrayIndex + " = " + randInts[arrayIndex]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
