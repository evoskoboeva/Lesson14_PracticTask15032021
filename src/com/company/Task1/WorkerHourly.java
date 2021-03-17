package com.company.Task1;

public class WorkerHourly extends Worker {
    protected  int HourWork;
    protected double rate;


    public WorkerHourly(String id, String name, int yearsWork, TypeWorker typeWorker, int hourWork, double rate) {
        super(id, name, yearsWork, typeWorker);
        this.HourWork = hourWork;
        this.rate = rate;

    }

   @Override
    public String toString() {
        return super.toString();
                //+"\t"+this.HourWork+ "\t"+Calculate();
    }

    @Override
    public Double Calculate() {

        double payReally = HourWork*rate;
        return (pay=payReally);
    }

}






