/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH12N8;

/**
 *
 * @author JeffreyMiller
 */
public class HexFormatException extends Exception {

    public HexFormatException() {
    }

    @Override
    public String toString() {
        return "HexFormatException: String contains non hexadecimal characters";
    }
    
}
