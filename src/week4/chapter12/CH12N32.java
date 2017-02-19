/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static week4.chapter12.CH12N31.stringBuilder;

/**
 * Babyname Ranking Summary
 * Show the most popular 5 names from each gender for each year
 * beginning with 2010 to 2001
 * Year Rank 1  Rank 2  Rank 3  Rank 4  Rank 5  Rank 1  Rank 2  Rank 3  Rank 4  Rank 5
 * 2010 girlname name   name    name    etc     etc
 * @author Jeff
 */
public class CH12N32 {
    public static void main(String[] args) {
        
        int girlRank = 0;
        int boyRank = 0;
        String headerLine = String.format("%6s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s",
                "Year","Rank 1","Rank 2","Rank 3","Rank 4","Rank 5",
                "Rank 1","Rank 2","Rank 3","Rank 4","Rank 5");
        System.out.println(headerLine);
        for(int i = 2015; i > 2000; i--){
            girlRank = 0;
            boyRank = 0;
            try(BufferedReader br = new BufferedReader(new FileReader(new File("./names/yob" + i + ".txt")))){
                String[] females = new String[5];
                String[] males = new String[5];
                while(br.ready()){
                    char c = (char)br.read();
                    stringBuilder.append(c);
                    if(c == '\n'){
                        //recordDetails[0] = name
                        //recordDetails[1] = gender
                        //recordDetails[2] = number
                        String[] recordDetails = stringBuilder.toString().split(",");
                        stringBuilder.setLength(0);

                        String recordGender = recordDetails[1];
                        if(recordGender.equalsIgnoreCase("f")){
                            if(girlRank < 5){
                                females[girlRank] = recordDetails[0];
                            }
                            girlRank++;
                        }
                        if(recordGender.equalsIgnoreCase("m")){
                            if(boyRank < 5){
                                males[boyRank] = recordDetails[0];
                            }
                            boyRank++;
                        }
                    }
                    //this outputs the file as it is read
                    //System.out.print(c);
                }
                String line = String.format("%6d%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s",
                        i,females[0],females[1],females[2],females[3],females[4],
                        males[0],males[1],males[2],males[3],males[4]);
                System.out.println(line);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
