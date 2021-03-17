package com.company.Task1;

public class WorkerConst extends Worker{

    private final int min = 6000;
    private final int DAY = 21;
    protected  int DayWork;
    protected  int PayMounth;

    private void setPayMounth(double PayMounth) {
        this.PayMounth = PayMounth >= min?  (int)PayMounth :min;
    }



    public WorkerConst(String id, String name, int yearsWork, TypeWorker typeWorker, int dayWork, int PayMounth) {
        super(id, name, yearsWork, typeWorker);
        this.DayWork = dayWork;
        this.setPayMounth(PayMounth);
    }




    public  int getDayWork() {
        return DayWork;
    }

    public void setDayWork(int dayWork) {
        DayWork = dayWork;
    }

    public double getPayMounth() {
        return this.PayMounth;
    }

   @Override
    public String toString() {

        return super.toString();
        //+this.getDayWork()+this.getPayMounth();

    }




    @Override
    public Double Calculate() {
        return (pay=PayMounth*DayWork/DAY);
    }
}
