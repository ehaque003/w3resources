package com.company;

import java.util.Arrays;

public class Array {
    private int[] scores1 = new int[] {2, 4, 3, 1, 8, 9, 4, 2, 7, 0};
    private int[] scores2 = new int[] { 9, 4, 2, 7, 3, 6, 3, 5, 8, 0};
    private String[] names1 = new String[10];
    private String[] names2 = new String[10];
    public int remove = 0;
    public int replace = 0;
    public int replacenum = 0;

    public void print(){
        Arrays.sort(scores1);
        Arrays.sort(names1);
    }
    public void add(){
        int sum = 0;
        for(int i = 0; i< scores1.length; i=i+1){
            sum=sum+ scores1[i];
        }
    }
    public void average(){
        int sum = 0;
        int average = 0;
        for(int i = 0; i< scores1.length; ++i){
            sum = sum+ scores1[i];
        }
        average=sum/ scores1.length;
    }
    public void test(){
        int test = scores1.length;

    }
    public void remove(){
        for(int i = 0; i < scores1.length; ++i){
            if(remove== scores1[i]){
                scores1[i]=0;
            }
        }
    }
    public void copy(){
        for(int i = 0; i < scores1.length; ++i){
            names1[i]= String.valueOf(scores1[i]);
        }
    }
    public void element(){
        scores1[replace]=replacenum;

    }
    public void max(){
        int max = 0;
        for(int i = 0; i< scores1.length; ++i){
            if(max< scores1[i]){
                max = scores1[i];
            }
        }
    }
    public void min(){
        int min = 0;
        for(int i = 0; i< scores1.length; ++i){
            if(min> scores1[i]){
                min = scores1[i];
            }
        }
    }
    public void reverse(){
        for(int i = 0; i< scores1.length; ++i){
            scores1[i]= scores1[scores1.length-i-1];
        }
    }
    public void P12(){
        Arrays.sort(scores1);
        for(int i = 0; i< scores1.length; ++i){
            if(scores1[i]== scores1[i+1]){
                scores1[i+1] = 0 - scores1[i+1];
                ++i;
            }
            else if(scores1[i]== scores1[i-1]){
                scores1[i-1]=0- scores1[i-1];
            }

        }
    }
    public void P13(){
        Arrays.sort(names1);
        for(int i = 0; i< names1.length; ++i){
            if(names1[i]== names1[i+1]){
                names1[i+1]= "Duplicate";
                ++i;
            }
            else if(names1[i]== names1[i-1]){
                names1[i-1]= "Duplicate";
            }
        }
    }
    public void P14(){
        for(int i = 0; i< scores1.length; ++i){
            for(int j = 0; j < scores2.length; ++j) {
                if (scores1[i] == scores2[j]) {
                    System.out.println(scores1[i]);
                }
            }
        }
    }
    public void P15() {
        for (int i = 0; i < names1.length; ++i) {
            for (int j = 0; j < names2.length; ++j) {
                if (names1[i] == names2[j]) {
                    System.out.println(names1[i]);
                }
            }
        }
    }
    public void P16(){
        for(int i = 0; i< scores1.length; ++i){
            for(int j = 0; j < scores2.length; ++j) {
                if (scores1[i] == scores2[j]) {
                    scores1[i]=0;
                }
            }

        }
    }
    public void P17(){
        int max = 0;
        int ind = 0;
        int max2 = 0;
        for(int j = 0; j<2; ++j){
            for(int i = 0; i< scores1.length; ++i){
                if(max<scores1[i]){
                    max = scores1[i];
                    ind = j;
                }
            }
            max2 = max;
            scores1[ind] = 0;
            max = 0;
        }
        System.out.println(max2);
    }
    public void P18(){
        int max = 0;
        int ind = 0;
        int max2 = 0;
        for(int j = 0; j<8; ++j){
            for(int i = 0; i< scores1.length; ++i){
                if(max<scores1[i]){
                    max = scores1[i];
                    ind = j;
                }
            }
            max2 = max;
            scores1[ind] = 0;
            max = 0;
        }
        System.out.println(max2);
    }
    public void P22(){
        int goalmade = 0;
        for(int i = 0; i< scores1.length; ++i){
            for(int j = 0; j< scores1.length; ++j){
                if(scores1[i]+scores1[j]==12){
                    ++goalmade;
                }
            }
        }
        System.out.println(goalmade);
    }
    public void P23(){
        Arrays.sort(scores1);
        Arrays.sort(scores2);
        int all = 0;
        for(int i =0; i<10; ++i){
            if(scores1[i]==scores2[i]){
                ++all;
            }
        }
    }
    public void P24(){
        int sub = 0;
        int befsub = 0;
        int ind = 0;
        for(int i = 0; i < scores1.length; ++i){
            sub = scores1[i+1]-scores1[i];
            if(scores1[i]==0){
                ind = i;
            }
            befsub=sub;
        }
        scores1[ind]= scores1[ind+1]-befsub;
    }
    public void P28(){
        int max = 0;
        int mini = 0;
        for(int i =0; i< scores1.length; ++i){
            if(max<scores1[i]){
                max = scores1[i];
            }
        }
        mini = max;
        for(int j =0; j< scores1.length; ++j){
            if(mini>scores1[j]){
                mini = scores1[j];
            }
        }
        System.out.println(max-mini);
    }



}
