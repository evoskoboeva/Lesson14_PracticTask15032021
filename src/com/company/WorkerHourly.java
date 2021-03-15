package com.company;

public class WorkerHourly extends Worker {
    private int HourWork;
    private double rate;


    public WorkerHourly(String id, String name, int yearsWork, TypeWorker typeWorker, int hourWork, double rate) {
        super(id, name, yearsWork, typeWorker);
        HourWork = hourWork;
        this.rate = rate;

    }

    @Override
    public String toString() {
        return super.toString()+"\t"+this.getId()+ "\t"+Calculate();
    }

    @Override
    public Double Calculate() {

        double payReally = HourWork*rate;


        return (pay=payReally);
    }

}






