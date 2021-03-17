package com.company.Task1;

public class Main {

    public static void main(String[] args) {

        Stuff stuff = new Stuff();

        WorkerConst workerConst0 = new WorkerConst
                ("11", "ivanov", 10, TypeWorker.constPay, 17, 23000);
        stuff.Add(workerConst0);
        WorkerConst workerConst1 = new WorkerConst
                ("12", "sidorov", 10, TypeWorker.constPay, 5, 30000);
        stuff.Add(workerConst1);
        stuff.Add(new WorkerConst
                ("13", "medoff", 10, TypeWorker.constPay, 22, 13000));
        stuff.Add(new WorkerConst
                ("14", "abramova", 10, TypeWorker.constPay, 20, 10000));
        stuff.Add(new WorkerConst
                ("15", "ivanova", 10, TypeWorker.constPay, 10, 3000));
        stuff.Add(new WorkerConst
                ("15", "pavlova", 10, TypeWorker.constPay, 10, 43000));


        WorkerHourly workerHourly0 = new WorkerHourly("21", "petrof", 8, TypeWorker.hourlyPay,
                1200, 65);
        stuff.Add(workerHourly0);
        stuff.Add(new WorkerHourly("22", "vetrov", 8, TypeWorker.hourlyPay,
                10, 160));
        stuff.Add(new WorkerHourly("23", "michailov", 5, TypeWorker.hourlyPay,
                120, 80));
        stuff.Add(new WorkerHourly("24", "vasserman", 18, TypeWorker.hourlyPay,
                12, 60));
        stuff.Add(new WorkerHourly("25", "lavrova", 10, TypeWorker.hourlyPay,
                120, 100));
        stuff.Add(new WorkerHourly("26", "efimova", 1, TypeWorker.hourlyPay,
                100, 60));

        System.out.println(workerConst0);
        System.out.println(workerHourly0);

        System.out.println(stuff);
        stuff.sortBySalary();
        System.out.println();
        System.out.println(stuff);
        int best = 5;
        System.out.println("Best "+best +"\n");


        for (int i = 0; i < best; i++) {
            System.out.println(stuff.getStuff(i));
        }
        int notbest = 3;

        System.out.println("Min pay -"+notbest +"\n");

        for (int i = stuff.stuff.size()-1; i >= stuff.stuff.size()-notbest; i--) {
            System.out.println(stuff.getStuff(i));
        }
    }
}

