package com.company;

public class Main {

    public static void main(String[] args) {

        WorkerConst workerConst = new WorkerConst
                ("1", "ivanov", 10, TypeWorker.constPay, 10, 3000);


        WorkerHourly workerHourly = new WorkerHourly("2", "petrof", 8, TypeWorker.hourlyPay,
                120, 60);

        System.out.println(workerConst);
        System.out.println(workerHourly);


        Stuff stuff = new Stuff();
        stuff.Add(workerHourly);
        stuff.Add(workerConst);

        System.out.println(stuff);
        stuff.sortBySalary();
        System.out.println();
        System.out.println(stuff);

    }
}

