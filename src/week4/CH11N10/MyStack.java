/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.CH11N10;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implement a stack by inheriting from ArrayList
 * @author JeffreyMiller
 * @param <T> Type MyStack operates with
 */
public class MyStack<T> extends ArrayList<T>{

    public MyStack(int initialCapacity) {
        super(initialCapacity);
    }

    public MyStack() {
    }

    public MyStack(Collection c) {
        super(c);
    }
    public T peek(){
        return get(size()-1);
    }
    public T pop(){
        return remove(size()-1);
    }
    public void push(T object){
        add(object);
    }

    @Override
    public String toString() {
        return "MyStack" + super.toString();
    }
    
    
}
