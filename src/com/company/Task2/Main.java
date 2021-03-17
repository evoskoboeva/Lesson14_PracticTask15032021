package com.company.Task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter size MyList");
        int size = scanner.nextInt();
        MyList MyList = new MyList();
        for (int i = 0; i < size; i++) {
            MyList.add(random.nextInt(10));
        }
        System.out.println(MyList);
        int get = 8;
        System.out.println("get " +get +"=  "+ MyList.get(get));
        int del = 5;
        MyList.DelByIndex(del);
        System.out.println("after Del"+del+"=  "+MyList);
        MyList.ReadOnlySize();
        MyList.DelAll();
        System.out.println("MyList after clean - "+MyList);

    }
}
