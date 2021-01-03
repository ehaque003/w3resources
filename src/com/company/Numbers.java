package com.company;

import java.util.Scanner;
import java.math.*;

public class Numbers {
    public void N1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        if(num%2==0||num%3==0||num%5==0){
            System.out.println(num+" is an ugly number.");
        }
        else{
            System.out.println(num+" is not a ugly number.");
        }
    }
    public void N2(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the number you want to test: ");
        int num = input.nextInt();
        int divsorcount = 0;
        for(int i = 1; i<num; ++i){
            if(num%i==0){
                divsorcount=divsorcount+i;
            }
        }
        if(divsorcount>num){
            System.out.println(num+" is a abundant number");
        }
        else if(divsorcount==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is a deficient number");
        }
    }
    public void N3(){
        Scanner in = new Scanner( System.in );
        System.out.print("Input the starting number of the range: ");
        int rsnum = in.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = in.nextInt();
        int random_num = rsnum + (int)(Math.random() * ((renum - rsnum) + 1));
        System.out.println(random_num);
    }
    public void N4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int num = input.nextInt();
        int numsquared = num*num;
        String numstring = String.valueOf(numsquared);
        System.out.println(numsquared+"");
        int middlenumber = (numstring.length()/2);
        System.out.println(middlenumber);
        int firstdigits = numsquared/(int)(Math.pow(10,middlenumber));
        System.out.println(firstdigits);
        int lastdigits = numsquared-(firstdigits*(int)(Math.pow(10,middlenumber)));
        System.out.println(lastdigits);
        if(lastdigits+firstdigits==num){
            System.out.println(num+" is a Kaprekar number");
        }
        else{
            System.out.println(num+" is not a Kaprekar number");
        }
    }
    //    public void N5(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Type in your number: ");
//        int num = input.nextInt();
//        String numstring = input.nextLine();
//        for(int i = 0; i<numstring.length(); ++i){
//            int reverse = numstring[numstring.length()-i-1];
//        }
//    }
    public void N6(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int num = input.nextInt();
        String numstring = num + "";
        int sum = 0;
        int currentnum=0;
        for(int i = 0; i<numstring.length(); ++i){
            currentnum = Integer.parseInt(String.valueOf(numstring.charAt(i)));
            sum = ((int) Math.pow(currentnum, numstring.length()))+sum;
        }
        if(sum==num){
            System.out.println(num +" is a narcissistic decimal number.");
        }
        else{
            System.out.println(num +" is not a narcissistic decimal number.");
        }
    }
    public void N7(){
        System.out.print("\nFirst ten Lucas a numbers: ");
        int n = 10;
        int n1 = 2, n2 = 1, n3;
        if (n > 1){
            System.out.println("\n2\n1");
            for(int i = 2; i < n; ++i){
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        }
        else if (n == 1)
            System.out.println("\n2");

        else
            System.out.println("Input a positive number.");
    }
    public void N8(){
        int num = 10;
        int[] t = new int[num + 2];
        t[1] = 1;
        System.out.print("\nList 10 Catalan numbers:-\n");
        for (int i = 1; i <= num; i++) {

            for (int j = i; j > 1; j--)
                t[j] = t[j] + t[j - 1];

            t[i + 1] = t[i];

            for (int j = i + 1; j > 1; j--)
                t[j] = t[j] + t[j - 1];
            System.out.printf("\n%d ", t[i + 1] - t[i]);
        }
        System.out.print("\n");
    }
    public void N9(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int num = input.nextInt();
        String numstring = num +"";
        int currentnum = 0;
        int sum = 0;
        System.out.println(num);
        System.out.println(numstring);
        while (true){
            for(int i = 0; i<numstring.length(); ++i){
                currentnum = Integer.parseInt(numstring.charAt(i)+"");
                System.out.println(currentnum);
                sum = ((int) Math.pow(currentnum, 2))+sum;
            }
            num=sum;
            numstring=sum+"";
            System.out.println(sum);
            sum=0;
            System.out.println( "Num = " + num);
            if(num==1){
                System.out.println(" is a Happy Number");
                break;
            }
        }
    }
    public void N14(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int num = input.nextInt();
        String numstring = num+"";
        int lastdigit = Integer.parseInt(numstring.charAt(numstring.length()-1)+"");
        String numsquared = ((int) Math.pow(num, 2))+"";
        int lastdigit2 = Integer.parseInt(numsquared.charAt(numsquared.length()-1)+"");
        if(lastdigit2==lastdigit){
            System.out.println(num+" is a Automorphic Number.");
        }
        else{
            System.out.println(num+" is not a Automorphic Number.");
        }
    }
    public void N15(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        String numstring = input.nextLine();
        if(numstring.charAt(0)=='0'){
            System.out.println(numstring+" is not a Duck number");
        }
        else{
            if(numstring.contains("0")){
                System.out.println(numstring+" is a Duck Number");
            }
            else{
                System.out.println(numstring+ " is not a Duck number");
            }
        }
    }
    public void N16(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int first_num = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Type in your second number: ");
        int second_num = input2.nextInt();
        int sum1 = 0;
        int sum2= 0;
        int checkall = 0;
        for(int i = 1; i<first_num; ++i){
            if(first_num%i==0){
                sum1=sum1+i;
            }
        }
        if(sum1==second_num){
            ++checkall;
        }
        for(int i = 1; i<second_num; ++i){
            if(second_num%i==0){
                sum2=sum2+i;
            }
        }
        if(sum2==first_num){
            ++ checkall;
        }
        if(checkall==2){
            System.out.println(first_num+" and "+second_num+" is an Amicable number");
        }
        else{
            System.out.println(first_num+" and "+second_num+" is not an Amicable number");
        }
    }
    public void N18(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int first_num = input.nextInt();
        int cube = (int) Math.pow(first_num, 1/3);
        if(cube*cube*cube==first_num){
            System.out.println(first_num+" is a perfect cube");
        }
        else{
            System.out.println(first_num+" is not a perfect cube");
        }
    }
    public void N20(){
        int n = 0;
        double result;

        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
    }
    public void N22(){

        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int n = input.nextInt();
        int num = (int)(Math.pow(2, n)-1);
        System.out.println(num+" is the "+n+" Mersenne number.");
    }
    public void N24(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
    public void N25(){
        int n,a=1,b=0,c;
        System.out.println("First 20 Pell numbers: ");
        for(n=1; n<=20; n++)
        {
            c= a + 2*b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public void N26(){
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        int n1 = n;
        String s = Integer.toString(n);
        int d=s.length();
        int arr[]=new int[n];
        int i, sum;
        for(i=d-1; i>=0; i--)
        {
            arr[i]=n1 % 10;
            n1=n1/10;

        }

        i=d; sum=0;
        while(sum<n)
        {
            sum = 0;
            for(int j=1; j<=d; j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }

        if(sum==n)
            System.out.println("Keith Number");
        else
            System.out.println("Not a Keith Number");
    }
    public void N28(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number: ");
        int num = input.nextInt();
        String numstring = num+"";
        int sum = 0;
        for(int i =0; i<numstring.length();++i){
            sum=((int)(Math.pow(Integer.parseInt(numstring.charAt(i)+""), 3)))+sum;
        }
        if(sum==num){
            System.out.println(num+" is a Keith Number");
        }
        else{
            System.out.println(num+ " is not a Keith Number");
        }

    }



}