package com.company;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;
import com.sun.tools.javac.jvm.ByteCodes.invokedynamic;

public class MathPrograms {
    int[] numbers = new int[]{1, 2, 4, 2, 1, 2, 32, 34, 21, 4, 52, 46, 57, 37, 8, 97, 5, 7, 54, 64, 66, 4, 64, 3, 5, 3, 35636};


    public void M1() {
        boolean idontknowwhyiamdoingthis = true;
    }

    public void M2() {
        double interger = 6.2D;
        String string = interger.makeConcatWithConstants<invokedynamic>(interger);
        int dotindex = 0;

        int i;
        for(i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == '.') {
                dotindex = i;
            }
        }

        for(i = dotindex; i < string.length(); ++i) {
            System.out.println(string.charAt(i));
        }

    }

    public void M3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        double inputint = input.nextDouble();
        String string = inputint.makeConcatWithConstants<invokedynamic>(inputint);
        if (string.contains(".")) {
            System.out.println(inputint + " is not a interger");
        } else {
            System.out.println(inputint + " is a Interger number");
        }

    }

    public void M4() {
        float x = 451.32565F;
        int decimal_place = 4;
        BigDecimal bd_num = new BigDecimal(Float.toString(x));
        bd_num.setScale(decimal_place, 4);
    }

    public void M5() {
        int count = 0;
        HashSet<Integer> set = new HashSet();

        for(int i = 0; i < this.numbers.length; ++i) {
            int n = Math.abs(this.numbers[i]);
            set.add(n);
        }

        System.out.println(count);
    }

    public void M6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        String string = input.nextLine();
        String reversestring = "";

        for(int i = 0; i < string.length(); ++i) {
            char var10000 = string.charAt(string.length() - i - 1);
            String key = var10000.makeConcatWithConstants<invokedynamic>(var10000);
            System.out.println(key);
            reversestring = reversestring + key;
        }

        System.out.println(reversestring);
    }

    public void M6_v2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        String string = input.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = string.length() - 1; i > -1; --i) {
            char key = string.charAt(i);
            sb.append(key);
        }

        System.out.println(sb.toString());
    }
}

