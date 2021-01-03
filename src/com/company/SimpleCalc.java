package com.company;

public class SimpleCalc {
    private int first;
    private int second;

    public int addition;

    public SimpleCalc(int x, int y) {
//         this.first = x;
//         this.second = y;
//         add();
    }

    public void printFirst() {
        System.out.println(this.first);
    }

    public void printSecond() {
        System.out.println(this.second);
    }

    private void add(){
        addition = this.first + this.second;
    }
}
