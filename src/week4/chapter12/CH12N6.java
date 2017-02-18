/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.util.Scanner;

/**
 * Throw NumberFormatException when converting hex to decimal
 * if the hex string is invalid.
 * @author Jeff
 */
public class CH12N6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();
        System.out.println("Hex: " + hex + " = " + hexToDecimal(hex));
    }
    public static int hexToDecimal(String hex) throws NumberFormatException{
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) throws NumberFormatException{
        if(ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else if(ch >= 'a' && ch <= 'f'){
            return 10 + ch - 'a';
        }
        else if(ch >= '0' && ch <= '9'){
            return ch - '0';
        }
        else
            throw new NumberFormatException();
    }
}
