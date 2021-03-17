package com.company.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHashMapTest");
        MyDictionary hashMaTest = new MyDictionary<String, Integer>();
        hashMaTest.put("micro", 1234566);
        hashMaTest.put("micro2", 1234567);
        hashMaTest.put("micro3", 1234568);
        hashMaTest.put("micro4", 1234569);
        hashMaTest.put("micro5", 12345610);
        hashMaTest.put("micro6", 12345611);
        hashMaTest.put("micro6", 1111111111);
        /*System.out.println(hashMaTest.get("micro6"));
        System.out.println(hashMaTest.get("micro3"));
        System.out.println(hashMaTest.get("micro4"));
        System.out.println(hashMaTest.get("micro5"));
        System.out.println(hashMaTest.get("micro2345"));*/


        System.out.println("\nCustom Map Test");
        MyDictionary<String, Integer> customMap = new MyDictionary();
        customMap.put("Test1", 10);
        customMap.put("Test2", 12);
    }
}
