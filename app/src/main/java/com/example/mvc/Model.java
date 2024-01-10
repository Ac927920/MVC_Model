package com.example.mvc;

public class Model {
    private int count;

    public Model(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
}
