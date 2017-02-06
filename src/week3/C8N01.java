/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sum elements by column
 * @author Jeff
 */
public class C8N01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] dArray = new double[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                dArray[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i < 4; i++){
            double sum = sumColumn(dArray,i);
            System.out.println("Sum of the elements at column " + i + " is " + sum);
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        
        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        
        return sum;
    }
}
