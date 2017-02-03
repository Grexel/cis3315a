/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Random;

/**
 *  Generate Random Characters
 * @author Jeff
 */
public class C6N38 {
    public static Random rand = new Random();
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(getRandomDigitCharacter() + " ");
            }
            System.out.println();
        }
    }
    public static char getRandomCharacter(char begin, char end){
        return (char)(rand.nextInt(end-begin) + begin);
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
}
