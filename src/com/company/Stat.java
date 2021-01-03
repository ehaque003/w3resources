package com.company;

import java.util.Arrays;

public class Stat {
    private int[] scores = new int[10];
    int median;
    int mean;

    public Stat() {}

    public void setscores(int[] x){
        this.scores = x;
    }

    public void calcMean(){
        int sum = 0;
        for(int i = 0; i < scores.length; ++i) {
            sum = sum + scores[i];
        }
        mean = sum/scores.length;
    }

    public void print(){
        for(int ind = 0; ind < scores.length; ind = ind + 1) {
            System.out.println(scores[ind]);

        }
    }

    public void doubleScore(){
        for(int ind = 0; ind < scores.length; ind = ind + 1) {
            scores[ind] = scores[ind] * 2;
        }
    }

    public void median(){
        int median = 0;
        if (scores.length%2==0){
            int med1 = (scores.length/2);
            int med2 = (scores.length/2)-1;
            median = (scores[med1]+scores[med2])/2;
            System.out.println(median);
        }
        else{
            median = scores[(scores.length/2)];
            System.out.print(median);

        }


    }
    public void mode(){
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < scores.length; ++i) {
            ++count[scores[i]];
        }
        int max = 0;
        int mode = 0;
        for(int d=0; d<count.length; ++d){
            if (max < count[d]){
                max = count[d];
                mode = d;
            }
        }
        System.out.println(mode);
    }
}

