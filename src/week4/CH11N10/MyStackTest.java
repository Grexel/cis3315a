/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH11N10;

import java.util.Scanner;

/**
 * Tests MyStack class
 * @author JeffreyMiller
 */
public class MyStackTest {
    public static void main(String[] args) {
        System.out.println("MyStack Tester");
        Scanner sc = new Scanner(System.in);
        MyStack<String> stringStack = new MyStack<>();
        System.out.println("Enter 5 Strings:");
        for(int i = 0; i < 5; i++){
            stringStack.add(sc.nextLine());
        }
        System.out.println("Input reversed:");
        while(!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
        }
    }
}
