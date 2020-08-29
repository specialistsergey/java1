/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.lab1.model;

/**
 *
 * @author Sergey
 */
public final class StackUtil {
    // максимальное кол-во элементов в стеке 
    private static final int MAX_SIZE = 100;
    
    // 
    private StackUtil(){}
    
    public static Stack createStack(Stack s) {
        
        Stack newStack = new SimpleStack(MAX_SIZE); 
        while(!s.isEmpty()){
            newStack.push(s.pop());
        }
        return newStack; 
    }
}
