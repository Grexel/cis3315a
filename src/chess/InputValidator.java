/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class InputValidator {
    PrintStream output;
    Scanner input;
    public InputValidator(PrintStream output, Scanner sc){
        this.output = output;
        this.input = sc;
    }
    public int getInt(){
        return getInt("Enter an integer: ");
    }
    public int getInt(String prompt){
        while(true){
            try{
                output.print(prompt);
                String str = input.nextLine();
                int value = Integer.parseInt(str);
                return value;
            }catch(Exception e){
                output.println("Error: Not a valid integer.");
            }
        }
    }
    public int getInt(int min, int max){
        return getInt("Enter an integer", min, max);
    }
    public int getInt(String prompt, int min, int max){
        while(true){
            try{
                output.print(prompt + " (" + min +"-" + max +"): ");
                String str = input.nextLine();
                int value = Integer.parseInt(str);
                if(value >= min && value <= max)
                    return value;
                else
                    output.println("Error: please input within range. ");
            }catch(Exception e){
                output.println("Error: Not a valid integer.");
            }
        }
    }
    public double getDouble(){
    return getDouble("Enter a double: ");
    }
    public double getDouble(String prompt){
        while(true){
            try{
                output.print(prompt);
                String str = input.nextLine();
                double value = Double.parseDouble(str);
                return value;
            }catch(Exception e){
                output.println("Error: Not a valid double.");
            }
        }
    }
    public double getDouble(double min, double max){
        return getDouble("Enter a double: ",min,max);
    }
    public double getDouble(String prompt, double min, double max){
        while(true){
            try{
                output.print(prompt);
                String str = input.nextLine();
                double value = Double.parseDouble(str);
                if(value >= min && value <= max)
                    return value;
                else
                    output.println("Error: please input within range. ");
            }catch(Exception e){
                output.println("Error: Not a valid double.");
            }
        }
    }
    public boolean yn(){
        return yn("Enter yes or no: ");
    }
    public boolean yn(String prompt){
        while(true){
            try{
                output.print(prompt);
                String str = input.nextLine();
                if(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes")){
                    return true;
                }
                else if(str.equalsIgnoreCase("n") || str.equalsIgnoreCase("no")){
                    return false;
                }
                else
                    output.println("Error: please enter (y)es or (n)o. ");
            }catch(Exception e){
                output.println("You have broken the universe. "
                        + "Please use your powers for good.");
            }            
        }
    }
    public String getLine(){
        return input.nextLine();
    }
    public String getLine(String prompt){
        output.print(prompt);
        return input.nextLine();
    }
    public String getStringFromList(String prompt, String[] choices){
        while(true){
            output.print(prompt);
            String userChoice = input.nextLine();
            for(String s : choices)
            {
                if(userChoice.equalsIgnoreCase(s)){
                    return s;
                }
            }
            output.println("Input not valid.");
        }
    }
    public String[] getChessMove(String prompt){
            output.print(prompt);
            String userInput = input.nextLine();
            userInput = userInput.toLowerCase();
            String[] moveArray = userInput.split(" ");
            System.out.println(moveArray[0] + moveArray[1]);
            //check if move is legit
            if(validChessMoveString(moveArray[0]) && validChessMoveString(moveArray[1])){
                return moveArray;
            }
            output.println("Input not valid.");
            return null;
    }
    public boolean validChessMoveString(String s){
        if(s != null && s.length() >= 2){
            char letter = s.charAt(0);
            //System.out.println("Letter is: " + letter + " : Number is");
            char number = s.charAt(1);
            if(letter >= 'a' && letter <= 'h'){
                if(number >= '1' && number <= '8'){
                    return true;
                }
            }
        }
        return false;
    }
}
