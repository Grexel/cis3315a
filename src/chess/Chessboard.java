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
public class Chessboard {
    /**
     * when looping, i is the row, j is the column
     */
    /**
     * White is Uppercase
     * Black is lowercase
     */
    boolean whiteTurn = true;
    char[][] board = {
        {'R','N','B','Q','K','B','N','R'},
        {'P','P','P','P','P','P','P','P'},
        {'-','-','-','-','-','-','-','-'},
        {'-','-','-','-','-','-','-','-'},
        {'-','-','-','-','-','-','-','-'},
        {'-','-','-','-','-','-','-','-'},
        {'p','p','p','p','p','p','p','p'},
        {'r','n','b','q','k','b','n','r'}
    };
    
    public Chessboard(){
        reset();
    }
    
    public void move(String[] userMove){
        int fromCol= userMove[0].charAt(0) - 'a';
        int fromRow  = userMove[0].charAt(1) - '1';
        int toCol = userMove[1].charAt(0) - 'a';
        int toRow = userMove[1].charAt(1) - '1';
        move(fromRow, fromCol, toRow, toCol);
    }
    public void move(int fromRow, int fromCol, int toRow, int toCol){
        //Check if valid move
        if(isValidMove(fromRow,fromCol,toRow,toCol)){
            board[toRow][toCol] = board[fromRow][fromCol];
            board[fromRow][fromCol] = '-';
            whiteTurn = !whiteTurn;
        }
    }
    public boolean isValidMove(String[] userMove){
        int fromCol= userMove[0].charAt(0) - 'a';
        int fromRow  = userMove[0].charAt(1) - '1';
        int toCol = userMove[1].charAt(0) - 'a';
        int toRow = userMove[1].charAt(1) - '1';
        //System.out.println("FR: " + fromRow + " FC: " + fromCol);
        //System.out.println("TR: " + toRow + " TC: " + toCol);
        return isValidMove(fromRow,fromCol,toRow,toCol);
    }
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol){
        char fromChar = board[fromRow][fromCol];
        //check if current player can move piece
        
        if(Character.isLowerCase(fromChar) && whiteTurn){
            System.out.println("White trying to use black player's pieces");
            return false;
        }
        else if(Character.isUpperCase(fromChar) && (!whiteTurn)){
            System.out.println("Black trying to use white player's pieces");
            return false;
        }
        switch(fromChar){
            case 'p': return pValidMove(fromRow,fromCol,toRow,toCol);
            case 'P': return PValidMove(fromRow,fromCol,toRow,toCol);
            case 'n': return nValidMove(fromRow,fromCol,toRow,toCol);
            case 'N': return NValidMove(fromRow,fromCol,toRow,toCol);
            case 'r': return rValidMove(fromRow,fromCol,toRow,toCol);
            case 'R': return RValidMove(fromRow,fromCol,toRow,toCol);
            case 'b': return bValidMove(fromRow,fromCol,toRow,toCol);
            case 'B': return BValidMove(fromRow,fromCol,toRow,toCol);
            case 'q': return qValidMove(fromRow,fromCol,toRow,toCol);
            case 'Q': return QValidMove(fromRow,fromCol,toRow,toCol);
            case 'k': return kValidMove(fromRow,fromCol,toRow,toCol);
            case 'K': return KValidMove(fromRow,fromCol,toRow,toCol);
            default: return false;
        }
        
    }
    public boolean pValidMove(int fromRow, int fromCol, int toRow, int toCol){
        char fromChar = board[fromRow][fromCol];
        char toChar = board[toRow][toCol];
        int moveX = fromCol - toCol;
        int moveY = fromRow - toRow;
        //pawn is moving forward
        if(moveX == 0){
            if(moveY == 1){
                if(toChar == '-')
                    return true;
            }
            else if(moveY == 2){
                if(fromRow == 6){
                    if(toChar == '-'){
                        return true;
                    }
                }
            }
        }
        //pawn is attacking
        else if( (moveX == 1 || moveX == -1) && (moveY == 1)){
            if(toChar != '-' && Character.isUpperCase(toChar)){
                return true;
            }
        }
        return false;
    }    
    public boolean PValidMove(int fromRow, int fromCol, int toRow, int toCol){
        char fromChar = board[fromRow][fromCol];
        char toChar = board[toRow][toCol];
        int moveX = fromCol - toCol;
        int moveY = fromRow - toRow;
        //pawn is moving forward
        if(moveX == 0){
            if(moveY == -1){
                if(toChar == '-')
                    return true;
            }
            else if(moveY == -2){
                if(fromRow == 1){
                    if(toChar == '-'){
                        return true;
                    }
                }
            }
        }
        //pawn is attacking
        else if( (moveX == 1 || moveX == -1) && (moveY == -1)){
            if(toChar != '-' && Character.isLowerCase(toChar)){
                return true;
            }
        }
        
        return false;
    }
    public boolean rValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }    
    public boolean RValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }
    public boolean nValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }    
    public boolean NValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }
    public boolean bValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }    
    public boolean BValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }
    public boolean qValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }    
    public boolean QValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }
    public boolean kValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }    
    public boolean KValidMove(int fromRow, int fromCol, int toRow, int toCol){
        return true;
    }
    
    
    public String display(){
        StringBuilder builder = new StringBuilder("");
        builder.append("  A B C D E F G H\n");
        for(int i = 0; i < board.length; i++){
            builder.append((i+1)).append(" ");
            for(int j = 0; j < board[i].length; j++){
                builder.append(board[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    public void reset(){
        char[][] board = {
            {'R','N','B','Q','K','B','N','R'},
            {'P','P','P','P','P','P','P','P'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'p','p','p','p','p','p','p','p'},
            {'r','n','b','q','k','b','n','r'}
        };
        this.board = board;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                builder.append(board[i][j] + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    public static void main(String[] args){
        Chessboard chess = new Chessboard();
        chess.display();
        chess.move(1,0,3,0);
        chess.display();
    }

}
