/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH12N8;

/**
 * Hex format exception for strings that contain non hexadecimal characters
 * @author JeffreyMiller
 */
public class HexFormatException extends Exception {

    public HexFormatException() {
        
    }

    public HexFormatException(String message) {
        super(message);
    }
}
