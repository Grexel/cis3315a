/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 * Use selection sort, sorting the largest number first.
 * 
 * @author Jeff
 */
public class C7N20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array of integers to sort: ");
        String arrString = sc.nextLine();
        String[] arrFragmented = arrString.split(" ");
        int[] intArray = new int[arrFragmented.length];
        for(int i = 0; i < arrFragmented.length; i++){
            intArray[i] = Integer.parseInt(arrFragmented[i]);
        }
        printArray(intArray);
        selectionSort(intArray);
        printArray(intArray);
    }
    public static void selectionSort(int[] array){
        int holder;
        int switchIndex;
        int max;
        for(int i = array.length-1; i >= 0; i--){
            max = array[i];
            switchIndex = i;
            for(int j = 0; j < i; j++){
                if(array[j] > max){
                    max = array[j];
                    switchIndex = j;
                }
            }
            holder = array[i];
            array[i] = array[switchIndex];
            array[switchIndex] = holder;
        }
    }
    
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
