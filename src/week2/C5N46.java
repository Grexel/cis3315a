/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *  Reverse a string
 * @author Jeff
 */
public class C5N46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to reverse: ");
        String string = sc.nextLine();
        System.out.println(reverseString(string));
    }
    public static String reverseString(String str){
        StringBuilder sB = new StringBuilder("");
        for(int i = str.length()-1; i>= 0; i--){
            sB.append(str.charAt(i));
        }
        return sB.toString();
    }
}
