package com.company;

import java.util.Scanner;

public class methods<max> {
    int[] intarray = {10,20,30,40,50};
    String str = "My name is Shayaan";
    int test = 123456789;
    public void M1(){
        int max = 0;
        for(int i = 0; i< intarray.length; ++i){
            if(max<intarray[i]){
                max = intarray[i];
            }
        }
        int min = max;
        for(int i = 0; i< intarray.length; ++i){
            if(min>intarray[i]){
                min = intarray[i];
            }
        }
        System.out.println(min);
    }
    public void M2(){
        int sum = 0;
        for(int i = 0; i< intarray.length; ++i){
            sum=sum+intarray[i];
        }
        System.out.println(sum/ intarray.length);
    }
    public void M3(){
        int middle = str.length();
        System.out.println(str.charAt(middle));
    }
    public void M4(){
        int vowels = 0;
        for(int i = 0; i<str.length(); ++i){
            if(str.charAt(i)=='a'){
                ++vowels;
            }
            else if(str.charAt(i)=='e'){
                ++vowels;
            }
            else if(str.charAt(i)=='i'){
                ++vowels;
            }
            else if(str.charAt(i)=='o'){
                ++vowels;
            }
            else if(str.charAt(i)=='u'){
                ++vowels;
            }
        }
    }
    public void M5(){
        String[] strarray = str.split(" ");
        System.out.println(strarray.length);
    }
    public void M6(){
        int sum = 0;
        int lastdigit = 0;
        while(test>0){
            lastdigit = test%10;
            sum=lastdigit+sum;
            test=test/10;
        }
        System.out.println(sum);
    }
    public void M7(){
        for(int i = 0; i<50; ++i){
            System.out.println((test*(test+1)/2)+test*(test-1));
        }
    }
    public void M8(){
        int p = 1000;
        int r = 2/100;
        int t = 50;
        System.out.println(p*r*t);
    }
    public void M10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
    public void M11(){
        char[] specchar = {'`','~','!','@','#','$','%','^','&','*','(',')','-','_','=','+','[',']','{','}','|',';',':','"',',','<','>','?'};
        int validConditionCount = 0;
        char[] num = {'1','2','3','4','5','6','7','8','9','0'};
        Scanner in = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = in.nextLine();
        if(password.length()>=8){
            ++validConditionCount;
        }
        else{
            System.out.print("You must have at least eight characters");
        }
        char[] chars = password.toCharArray();
        ++validConditionCount;
        for(int j =0; j< chars.length; ++j){
            for(int i = 0; i<specchar.length; ++i){
                if(chars[j]==specchar[i]){
                    System.out.println("You entered a special character");
                    validConditionCount=validConditionCount-1;
                    break;
                }
            }
        }


        int sum2 = 0;
        for(int j =0; j< chars.length; ++j){
            for(int i = 0; i<num.length; ++i){
                if(chars[j]==num[i]){
                    sum2=sum2+1;
                }
            }
        }
        if(sum2>=2){
            ++validConditionCount;
        }
        else{
            System.out.println("You must add more digits");
        }
        if(validConditionCount==2){
            System.out.print(password+" is a good password");
        }
        else{
            System.out.print(password+" is a bad password");
        }
    }
    public void M11_v2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = in.nextLine();
        int digitCount = 0;
        if(password.length()>=8){
            char[] pwdCharArray = password.toCharArray();

            for(char c : pwdCharArray){
                if(Character.isLetterOrDigit(c)){
                    if(Character.isDigit(c)) {
                    }
                }
                else {
                    System.out.println("");
                    break;
                }
            }
        }
        else{
            System.out.print("You must have at least eight characters");
        }
        if(digitCount >= 2) {

        } else {

        }
    }
    public void M13(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the base: ");
        int base = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the height: ");
        int height = in.nextInt();
        int area = (height*base)/2;
        System.out.println("The area of the triangle is "+area);
    }
    public void M14(){
        Scanner in = new Scanner(System.in);

    }

}

