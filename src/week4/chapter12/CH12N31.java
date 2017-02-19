/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 * Prompt the user to enter a year, a gender, and a name
 * 
 * Files can be found at www.ssa.gov/oact/babynames/...
 * with yearly text files called "babynamerankingXXXX.txt" where XXXX is the year
 * 
 * The files lines are formatted as such:
 * name,gender,number
 * with names descending in popularity and genders separated, female then male
 * @author Jeff
 */
public class CH12N31 {
        public static StringBuilder stringBuilder = new StringBuilder("");
    public static void main(String[] args) {
        String year;
        String gender;
        String name;
        int nameRank = -1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Baby name popularity ranking");
        System.out.println("");
        System.out.print("Enter the year: ");
        year = sc.nextLine();
        System.out.print("Enter the gender(m/f): ");
        gender = sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        
        int girlRank = 0;
        int boyRank = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(new File("./names/yob" + year + ".txt")))){
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
                    if(gender.equalsIgnoreCase("m")){
                        boyRank++;
                        if(recordDetails[0].equalsIgnoreCase(name)){
                            nameRank = boyRank;
                            break;
                        }
                    }
                    if(gender.equalsIgnoreCase("f")){
                        girlRank++;
                        if(recordDetails[0].equalsIgnoreCase(name)){
                            nameRank = girlRank;
                            break;
                        }
                    }
                }
                //this outputs the file as it is read
                //System.out.print(c);
            }
            System.out.println("");
            if(nameRank == -1){
                //name not found in baby rank file
                System.out.println("The name " + name + " is not ranked in year " + year);
            }
            else{
                System.out.println(name + " is ranked " + nameRank + " in year " + year);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
