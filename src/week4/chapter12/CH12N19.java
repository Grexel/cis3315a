/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.net.URL;

/**
 * Count the words in Lincoln's Gettysburg address from
 * http://cs.armstrong.edu/liang/data/Lincoln.txt
 * 
 * @author JeffreyMiller
 */
public class CH12N19 {
    public static void main(String[] args) {
        //need bufferedReader of URL
        //read bytes if Character is whitespace clear word, add to count if 
        //word is empty
        try(BufferedInputStream bis = new BufferedInputStream(
                new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt").openStream())){
            while(bis.available() > 0){
                char c = (char)bis.read();
                System.out.print(c);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
