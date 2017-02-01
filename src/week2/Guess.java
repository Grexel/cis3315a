/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.io.*;
import java.util.*;

/**
 * Have the user guess a number between 1-10 until correct.
 * This line added in github
 * @author Jeffrey Miller
 */
public class Guess {
    Scanner sc;
    PrintStream out;
    Random rand;
    
    int winningNumber;
    int guess;
    
    public Guess(){
        initialize();
    }
    public void initialize(){
        sc = new Scanner(System.in);
        rand = new Random();
        out = System.out;
        winningNumber = rand.nextInt(10) + 1;
        guess = -1;
    }
    public void playGame(){        
        winningNumber = rand.nextInt(10) + 1;
        guess = -1;
        
        System.out.println("Jeffrey's guessing game.");
        System.out.println("Guess a number from 1 - 10.");
        
        while(guess != winningNumber){
            System.out.print("Enter a number: ");
            guess = Integer.parseInt(sc.nextLine());
            if(guess == winningNumber){
                System.out.println("You guessed it!");
            }
            else if(guess < winningNumber){
                System.out.println("Too low.");
            }
            else if(guess > winningNumber){
                System.out.println("Too high.");
            }
            else{
                //totally unnecessary else statement
                System.out.println("You're a wizard, Harry!");
            }
        }
    }
    public static void main(String[] args) {
        Guess g = new Guess();
        g.playGame();
    }
}
