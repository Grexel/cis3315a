/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Prompt the user to enter a year, a gender, and a name
 * 
 * Files can be found at www.ssa.gov/oact/babynames/...
 * with yearly text files called "babynamerankingXXXX.txt" where XXXX is the year
 * 
 * The files lines are formatted as such:
 * rank#    Boyname     numberOfName    Girlname    numberOfName
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
        
        try(BufferedInputStream bis = new BufferedInputStream(
                new URL("http://www.ssa.gov/oact/babynames/babynameranking" + year + ".txt").openStream())){
            while(bis.available() > 0){
                char c = (char)bis.read();
                stringBuilder.append(c);
                if(c == '\n'){
                    //recordDetails[0] = rank
                    //recordDetails[1] = boyname
                    //recordDetails[2] = numberOfBoys
                    //recordDetails[3] = girlName
                    //recordDetails[4] = numberOfGirls
                    String[] recordDetails = stringBuilder.toString().split(" ");
                    stringBuilder.setLength(0);
                    
                    int rank = Integer.parseInt(recordDetails[0]);
                    if(gender.equalsIgnoreCase("m")){
                        if(recordDetails[1].equalsIgnoreCase(name))
                            nameRank = rank;
                    }
                    if(gender.equalsIgnoreCase("f")){
                        if(recordDetails[3].equalsIgnoreCase(name))
                            nameRank = rank;
                    }
                }
                System.out.print(c);
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
