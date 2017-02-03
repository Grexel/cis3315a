/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 * Reverse an array method
 * 
 * @author Jeff
 */
public class C7N12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array of integers to reverse: ");
        String arrString = sc.nextLine();
        String[] arrFragmented = arrString.split(" ");
        int[] intArray = new int[arrFragmented.length];
        for(int i = 0; i < arrFragmented.length; i++){
            intArray[i] = Integer.parseInt(arrFragmented[i]);
        }
        int[] revArray = reverseArray(intArray);
        printArray(intArray);
        printArray(revArray);
    }
    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverseArray[i] = array[array.length - i -1];
        }
        return reverseArray;
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
