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
    public static final int NEW_GAME = 1;
    public static final int NEW_USER = 2;
    public static final int QUIT = 0;
    
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
        //System.out.println(NEW_USER + ": New User");
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
        boolean isPlaying = true;
        String[] choices = {"m","q"};
        while(isPlaying){
            System.out.println(chessBoard.display());
            if(chessBoard.whiteTurn){
                System.out.print("White's turn. ");
            }
            else{
                System.out.print("Black's turn. ");       
            }
            String choice = input.getStringFromList("(m)Move, (q)Quit:", choices);
            if(choice.equalsIgnoreCase("m")){
                move();
            }
            if(choice.equalsIgnoreCase("q")){
                isPlaying = false;
            }
        }
    }
    public void move(){
        boolean moveComplete = false;
        while(!moveComplete){
            System.out.println(chessBoard.display());
            String[] userMove = input.getChessMove("Enter piece to move from-to i.e(a1 a5) ");
            if(chessBoard.isValidMove(userMove)){
                chessBoard.move(userMove);
                moveComplete = true;
            }
            else{
                System.out.println("Invalid Move.");
            }
        }
    }
    
    public static void main(String[] args) {
        ChessUI chessInterface = new ChessUI();
        chessInterface.mainMenu();
    }
}
