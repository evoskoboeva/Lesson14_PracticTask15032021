package com.company.Task2;

public class Main {
    public static void main(String[] args) {

        MyList customList = new MyList();
        for (int i = 0; i < 10; i++) {
            customList.add(i);
        }
        System.out.println(customList);
        System.out.println("test get " + customList.get(8));
        customList.remove(5);

    }
}
