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
public interface Stack {
    
    // поместить число в стек 
    void push(int value);         
    // извлечь число с вершины стека
    int pop();   		      
    // проверяет, есть ли еще элементы в данном стеке 
    boolean isEmpty();            
}
