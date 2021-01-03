package com.company;
import java.util.Locale;
import  java.util.Scanner;

public class string {
    String test = "My name is Shayaan Haq";
    String test2 = "My name is Arian Haq";
    String alphebat = "The quick brown fox jumps over the lazy dog.";

    public void P1(){
        Scanner question = new Scanner(System.in);
        System.out.println("At what index do you want to see the character");
        int ind = Integer.parseInt(question.nextLine());
        char char1 = test.charAt(1);
        char char2 = test.charAt(6);
        System.out.println("The character at position 1 is" + char1);
        System.out.println("The character at position 6 is" + char2);
    }
    public void P2(){
        int testresultinunicode = test.codePointAt(0);
        System.out.println("The unicode for the character is" +testresultinunicode);
    }
    public void P3(){
        int beforespecificindexgiventest = test.codePointBefore(4);
        System.out.println("The unicode for the before given index is" +beforespecificindexgiventest);
    }
    public void P4(){
        int allcharsinint = test.codePointAt(0);
        System.out.println(allcharsinint);
    }
    public void P5(){
        int checkingifallaresame = (test.compareTo(test2));
        System.out.println(checkingifallaresame);
    }
    public void P6(){
        System.out.print(test.compareToIgnoreCase(test2));
    }
    public void P7(){
        System.out.print(test.concat(test2));
    }
    public void P8(){
        System.out.println(test.contains("e"));
    }
    public void P21(){
        char[] letters = alphebat.toCharArray();
        for(int i =0; i<letters.length; ++i){
            System.out.print(letters[i]+"'s index is " +i);

        }
    }
    public void P22(){
        System.out.println(test.length());
    }
    public void P24(){
        System.out.println(test.replace('s', 'b'));
    }
    public void P25(){
        System.out.println(test.substring(11, 17));
    }
    public void P26(){
        char[] allchar = test.toCharArray();
        for(int i = 0; i<allchar.length; ++i){
            System.out.println(allchar[i]);
        }
    }
    public void P29(){
        System.out.print(test.toLowerCase());
    }
    public void P30(){
        System.out.print(test.toLowerCase());
    }
    public void P31(){
        System.out.println(test.trim());
    }

}
