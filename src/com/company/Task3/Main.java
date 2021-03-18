package com.company.Task3;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    private MyHashMap myHashMap;

    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("Awadh", "SSE");
        myHashMap.put("Rahul", "SSE");
        myHashMap.put("Sattu", "SE");
        myHashMap.put("Gaurav", "SE");
        myHashMap.put("123", "456");

        System.out.println(myHashMap);

        String  temp = "Awadh";
        MyHashMap.Entry e =  myHashMap.get(temp);
        System.out.println(" Get  "+temp+" = "+e.getValue());
        myHashMap.ReadOnlySize();

    }
}
