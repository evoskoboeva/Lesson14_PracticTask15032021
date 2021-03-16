package com.company.Task1;

import java.util.Comparator;

abstract public class Worker implements IWorker{
    private String id;
    private String name;
    private int yearsWork;
    protected double pay;

    public static Comparator<Worker> BySalary = (w1, w2) -> (int) (w1.Calculate() - w2.Calculate());

    private TypeWorker typeWorker;

    public Worker(String id, String name, int yearsWork,  TypeWorker typeWorker) {
        this.id = id;
        this.name = name;
        this.yearsWork = yearsWork;
        this.typeWorker = typeWorker;
    }

    @Override
    public String toString() {
        this.Calculate();
        return this.getClass().getSimpleName() +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearsWork=" + yearsWork +

                ", typeWorker=" + typeWorker +
                "pay: "+pay+
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsWork() {
        return yearsWork;
    }

    public void setYearsWork(int yearsWork) {
        this.yearsWork = yearsWork;
    }



    public TypeWorker getTypeWorker() {
        return typeWorker;
    }

    public void setTypeWorker(TypeWorker typeWorker) {
        this.typeWorker = typeWorker;
    }


    public static void add(Worker worker) {
    }
}
