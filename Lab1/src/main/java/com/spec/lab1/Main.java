/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.lab1;

import com.spec.lab1.model.SimpleStack;
import com.spec.lab1.model.Stack;
import com.spec.lab1.model.StackUtil;

/**
 *
 * @author Sergey
 */
public class Main {
    
    public static void main(String[] args) {
        
        Stack s = new SimpleStack(3);
        System.out.println("s.isEmpty=" + s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        
//        System.out.println("s.pop=" + s.pop());
//        System.out.println("s.pop=" + s.pop());
//        System.out.println("s.pop=" + s.pop());
//        System.out.println("s.pop=" + s.pop());
        
        System.out.println("s=" + s);
        Stack s1 = StackUtil.createStack(s); 
        System.out.println("s1=" + s1);
        System.out.println("s1.pop=" + s1.pop());
        System.out.println("s1.pop=" + s1.pop());
        System.out.println("s1.pop=" + s1.pop());
        
        System.out.println("s1.isEmpty=" + s1.isEmpty());
        System.out.println("s1.pop=" + s1.pop());
        System.out.println("s1.isEmpty=" + s1.isEmpty());

    }
    
}
