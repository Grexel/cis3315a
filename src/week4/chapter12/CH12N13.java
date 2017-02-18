/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Count the characters, words, and lines in a file.
 * pass filename in as an argument
 * @author JeffreyMiller
 */
public class CH12N13 {
    public static void main(String[] args) {
        if(args.length == 0){
            return;
        }
        String fileName = args[0];
        File f = new File(fileName);
        int numCharacters = 0; 
        int numWords = 0;
        int numLines = 0;
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String nextLine = sc.nextLine();
                numLines++;
                String[] words = nextLine.split(" ");
                numWords += words.length;
                for(String word : words){
                    numCharacters += word.length();
                }
            }
            System.out.println(numCharacters + " characters");
            System.out.println(numWords + " words");
            System.out.println(numLines + " lines");
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }
}
