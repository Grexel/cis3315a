/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 * Calculate the checksum of a 13 digit ISBN using the first 12 digits
 * @author Jeff
 */
public class C5N47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn12 = sc.nextLine();
        if(isbn12.length() != 12){
            System.out.println(isbn12 + " is an invalid input.");
        }
        else{
            String isbn13 = completeISBN13(isbn12);
            System.out.println(isbn13);
        }
    }
    public static String completeISBN13(String isbn12){
        int digitSum = 0;
        for(int i = 0; i < isbn12.length();i++){
            if(i%2 == 0){
                digitSum += Integer.parseInt(isbn12.substring(i,i+1));
            }
            else{
                digitSum += 3 * Integer.parseInt(isbn12.substring(i,i+1));
            }
        }
        digitSum = 10 - digitSum % 10;
        if(digitSum == 10){
            digitSum = 0;
        }
        return isbn12 + String.valueOf(digitSum);
    }
}
