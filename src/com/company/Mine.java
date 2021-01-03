package com.company;

public class Mine {
    private int a, b, c;

    public Mine(){
    }
    public void change(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void printouta(){
        System.out.println(this.a);
    }
    public void printoutb(){
        System.out.println(this.b);
    }
    public void printoutc(){
        System.out.println(this.c);
    }
}

