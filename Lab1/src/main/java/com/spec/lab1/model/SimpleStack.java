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
public class SimpleStack implements Stack {

    private int[] array;
    private int pos = -1;

    public SimpleStack(int size) {
        array = new int[size];
    }

    @Override
    public void push(int value) {
        if (pos != array.length - 1) {
            pos++;
            array[pos] = value;
        }
    }

    @Override
    public int pop() {
        return pos < 0 ? 0 : array[pos--];
    }

    @Override
    public boolean isEmpty() {
        return pos == -1;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i <= pos; i++) {
            s = s + array[i] + ",";
        }
        return s;
    }
}
