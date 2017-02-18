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
 * Create a large dataset of 1000 records containing the following informaton:
 * each line contains - Firstname Lastname rank salary
 * for i from 0 to 1000
 *  Firstname(i) Lastname(i) rank = random(3){Assistant,Associate,Full} salary
 * Salary = Assistant 50,000 - 80,000
 *          Associate 60,000 - 110,000
 *          Full      75,000 - 130,000
 * Salary includes 2 digit cent value
 * 
 * File needs to be saved to Salary.txt
 * example
 * Firstname1 Lastname1 assistant 60055.95
 * @author JeffreyMiller
 */
public class CH12N24 {
    public static Random rand = new Random();
    public static StringBuilder stringBuilder = new StringBuilder("");
    public static void main(String[] args) {
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(new File("./Salary.txt")))){
            for(int i = 1; i <= 1000; i++){
                bf.write(createRandomFacultyRecord(i));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader(new File("./Salary.txt")))){
            while(br.ready()){
                char c = (char)br.read();
                System.out.print(c);
//                if(c == '\n'){
//                    System.out.println("");
//                }else{
//                    System.out.print(c);
//                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static String createRandomFacultyRecord(int number){
        stringBuilder.append("FirstName").append(number).append(" ");
        stringBuilder.append("LastName").append(number).append(" ");
        int rank = rand.nextInt(3);
        double salary;
        String rankName;
        if(rank == 0) //assistant
        {
            stringBuilder.append("assistant").append(" ");
            //min 50000 max 80000
            salary = rand.nextDouble() * (80000 - 50000) + 50000;
            stringBuilder.append(String.format("%2.2f", salary)).append("\n");
        }
        if(rank == 1) //associate
        {
            stringBuilder.append("associate").append(" ");
            //min 60000 max 110000
            salary = rand.nextDouble() * (110000 - 60000) + 60000;
            stringBuilder.append(String.format("%2.2f", salary)).append("\n");
        }
        if(rank == 2) //full
        {
            stringBuilder.append("full").append(" ");
            //min 75000 max 130000
            salary = rand.nextDouble() * (130000 - 75000) + 75000;
            stringBuilder.append(String.format("%2.2f", salary)).append("\n");
        }
        String recordText = stringBuilder.toString();
        stringBuilder.setLength(0);
        return recordText;
    }
}
