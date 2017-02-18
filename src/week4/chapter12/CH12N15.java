/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

/**
 * Write/Read integers to file
 * 100 random integers separated by spaces are written
 * to Exercise12_15.txt
 * 
 * @author JeffreyMiller
 */
public class CH12N15 {
    public static void main(String[] args) {
        Random rand = new Random();
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(new File("./Exercise12_15.txt")))){
            for(int i = 0; i < 100; i++){
                bf.write(Integer.toString(rand.nextInt()));
                bf.write(" ");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader(new File("./Exercise12_15.txt")))){
            while(br.ready()){
                char c = (char)br.read();
                if(c == ' '){
                    System.out.println("");
                }else{
                    System.out.print(c);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
