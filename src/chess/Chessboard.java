/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Jeff
 */
public class Chessboard {
    //char[][] board = new char[8][8];
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
    public void move(int fromI, int fromJ, int toI, int toJ){
        board[toI][toJ] = board[fromI][fromJ];
        board[fromI][fromJ] = '-';
    }
    public void display(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Chessboard chess = new Chessboard();
        chess.display();
        chess.move(1,0,3,0);
        chess.display();
    }
}
