/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class ChessUI {
    public static final int NEW_GAME = 0;
    public static final int NEW_USER = 1;
    public static final int QUIT = 2;
    
    InputValidator input;
    Scanner sc;
    Chessboard chessBoard;
    public ChessUI(){
        sc = new Scanner(System.in);
        input = new InputValidator(System.out, sc);
        chessBoard = new Chessboard();
    }
    public void mainMenu(){
        boolean isRunning = true;
        while(isRunning){
            displayMainMenu();
            int choice = input.getInt(0, 2);
            if(choice == QUIT){
                break;
            }
            chooseMainMenu(choice);
        }
    }
    public void displayMainMenu(){
        System.out.println(NEW_GAME + ": New Game");
        System.out.println(NEW_USER + ": New User");
        System.out.println(QUIT + ": Quit");
        System.out.println("");
    }
    public void chooseMainMenu(int choice){
        if(choice == NEW_GAME){
            playGame();
        }
        else if(choice == NEW_USER){
            System.out.println("User functionality not implemented yet.");
        }
    }
    public void playGame(){
        System.out.println(chessBoard.display());
    }
    
    public static void main(String[] args) {
        ChessUI chessInterface = new ChessUI();
        chessInterface.mainMenu();
    }
}
