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
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Processing a large dataset:
 * Using a dataset much like the one created in CH12N24,
 * parse a file to show:
 * total salary for assistant, associate, full professors, and all faculty
 * average salary for "     "       "           "         "          "
 * 
 * http://cs/armstrong.edu/liang/data/Salary.txt
 * @author Jeff
 */

/** CH12N24
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
public class CH12N25 {
    public static void main(String[] args) {
        int numberOfAssistants = 0;
        int numberOfAssociates = 0;
        int numberOfFull = 0;
        
        double totalAssistantSalary = 0;
        double totalAssociateSalary = 0;
        double totalFullSalary = 0;
        
        System.out.println("Analysis of salaries from\n" +
                "http://cs.armstrong.edu/liang/data/Salary.txt");
        try(Scanner br = new Scanner(new URL("http://cs.armstrong.edu/liang/data/Salary.txt").openStream())){
            while(br.hasNext()){
                String[] recordDetails = br.nextLine().split(" ");
                String rank = recordDetails[2];
                String salary = recordDetails[3];
                if(rank.equalsIgnoreCase("assistant")){
                    numberOfAssistants++;
                    totalAssistantSalary += Double.parseDouble(salary);
                }
                else if(rank.equalsIgnoreCase("associate")){
                    numberOfAssociates++;
                    totalAssociateSalary += Double.parseDouble(salary);
                }
                else if(rank.equalsIgnoreCase("full")){
                    numberOfFull++;
                    totalFullSalary += Double.parseDouble(salary);
                }
                //System.out.print(c);
            }
            //Format and print the salary table
            System.out.println(String.format("%12s %12s %12s"," ", "Average Salary","Total Salary"));
            System.out.println(
                String.format("%12s %12.2f %12.2f","Assistant", totalAssistantSalary/numberOfAssistants,totalAssistantSalary));
            System.out.println(
                String.format("%12s %12.2f %12.2f","Associate", totalAssociateSalary/numberOfAssociates,totalAssociateSalary));
            System.out.println(
                String.format("%12s %12.2f %12.2f","Full", totalFullSalary/numberOfFull,totalFullSalary));
            int totalFaculty = numberOfAssistants + numberOfAssociates + numberOfFull;
            double totalSalary = totalAssistantSalary + totalAssociateSalary + totalFullSalary;
            System.out.println(
                String.format("%12s %12.2f %12.2f","All", totalSalary/totalFaculty,totalSalary));
        }catch (MalformedURLException ex) {
            Logger.getLogger(CH12N25.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }catch (IOException ex) {
            Logger.getLogger(CH12N25.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
    
}
