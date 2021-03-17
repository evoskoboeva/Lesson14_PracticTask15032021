package com.company.Task1;

import java.util.Comparator;

abstract public class Worker implements IWorker{
    private String id;
    private String name;
    private int yearsWork;
    protected double pay;

    public static Comparator<Worker> BySalary = (w1, w2) -> (int) (w2.Calculate() - w1.Calculate());

    private TypeWorker typeWorker;

    public Worker(String id, String name, int yearsWork,  TypeWorker typeWorker) {
        this.id = id;
        this.name = name.substring(0,1).toUpperCase()+name.substring(1);
        this.yearsWork = yearsWork;
        this.typeWorker = typeWorker;
    }


    @Override
    public String toString() {
        this.Calculate();
        return this.getClass().getSimpleName() +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pay= "+String.format("%10.2f грн.",pay);
    }

}
