package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashSetQuestion {
    HashSet<String> fruits = new HashSet<String>(){
        {
            add("Orange");
            add("Yellow");
            add("Blue");
            add("Red");
            add("Purple");
        }
    };
    public void P3(){
        fruits.size();
    }
    public void P4(){
        fruits.clear();
    }
    public void P5(){
        if(fruits.isEmpty()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public void P6(){
        HashSet<String> test = new HashSet<String>();
        test = (HashSet) fruits.clone();

    }
    public void P7(){
        String[] new_array = new String[fruits.size()];
        fruits.toArray(new_array);
    }
    public void P9(){
        List<String> list = new ArrayList<String>(fruits);
    }
    public void P12(){
        fruits.clear();
    }
}
