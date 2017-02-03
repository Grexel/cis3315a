/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 * Format an integer to add leading 0's
 * Return as a String
 * @author Jeff
 */
public class C6N37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and it's final width: ");
        int number = sc.nextInt();
        int width = sc.nextInt();
        
        String formattedInt = format(number, width);
        System.out.println(formattedInt);
    }
    public static String format(int number, int width){
        StringBuilder numberString = new StringBuilder(String.valueOf(number));
        int num0s = width - numberString.length();
        for(int i = 0; i < num0s; i++){
            numberString.insert(0, "0");
        }
        return numberString.toString();
    }
}
