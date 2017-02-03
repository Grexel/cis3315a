/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 * Count the number of vowels and consonants in a string
 * @author Jeff
 */
public class C5N49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = numberOfVowels(str);
        int consonants = numberOfConsonants(str);
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
    public static int numberOfVowels(String str){
        int numVowels = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!Character.isAlphabetic(c)){
                continue;
            }
            if(isVowel(c)){
                numVowels++;
            }
        }
        return numVowels;
    }
    public static int numberOfConsonants(String str){
        int numConsonants = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!Character.isAlphabetic(c)){
                continue;
            }
            if(!isVowel(c)){
                numConsonants++;
            }
        }
        return numConsonants;
    }
    public static boolean isVowel(char c){
        switch(c){
            case 'a': return true;
            case 'A': return true;
            case 'e': return true;
            case 'E': return true;
            case 'i': return true;
            case 'I': return true;
            case 'o': return true;
            case 'O': return true;
            case 'u': return true;
            case 'U': return true;
            default: return false;
        }
    }
}
