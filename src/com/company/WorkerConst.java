package com.company;

public class WorkerConst extends Worker{

    private final int min = 6000;
    private final int DAY = 21;
    private int DayWork;

    private void setPayMounth(double payMounth) {
        if (this.PayMounth < min){
            this.PayMounth = 6000;
        }
    }

    private double PayMounth;

    public WorkerConst(String id, String name, int yearsWork, TypeWorker typeWorker, int dayWork, double payMounth) {
        super(id, name, yearsWork, typeWorker);
        this.DayWork = dayWork;
        this.setPayMounth(PayMounth);
    }




    public int getDayWork() {
        return DayWork;
    }

    public void setDayWork(int dayWork) {
        DayWork = dayWork;
    }

    public double getPayMounth() {
        return PayMounth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "min=" + min +
                ", DAY=" + DAY +
                ", DayWork=" + DayWork +
                ", PayMounth=" + PayMounth +
                '}';
    }



    @Override
    public Double Calculate() {
        return (pay=PayMounth*DayWork/DAY);
    }
}
