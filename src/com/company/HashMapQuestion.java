package com.company;
import java.util.HashMap;
import java.util.Set;

public class HashMapQuestion {
    HashMap<String, String> fruits = new HashMap<String, String>(){
        {
            put("Orange", "Orange");
            put("Yellow", "Banana");
            put("Blue", "Blueberries");
            put("Red", "Apple");
            put("Purple", "Grapes");
        }
    };
    HashMap<String, String> test = new HashMap<String, String>();
    public void P2(){
        System.out.println("The size of the Hash Map is "+fruits.size());
    }
    public void P3(){
        test.putAll(fruits);
    }
    public void P4(){
        test.clear();
    }
    public void P5(){
        if (test.isEmpty()){
            System.out.print("The map is empty.");
        }
        else{
            System.out.println("The map is not empty");
        }
    }
    public void P6(){
        test = (HashMap)fruits.clone();
    }
    public void P7(){
        if(test.containsKey("Green")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public void P8(){
        if(test.containsValue("Apple")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public void P9(){
        Set set = fruits.entrySet();
    }
    public void P10(){
        System.out.println(fruits.get("Red"));
    }
    public void P11(){
        Set keyset = fruits.keySet();
    }
    public void P12(){
        System.out.println("Collection view is: "+ fruits.values());
    }
}

