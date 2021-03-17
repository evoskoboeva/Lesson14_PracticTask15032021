package com.company.Task1;

import java.util.ArrayList;
import java.util.Collections;

public class Stuff {
    ArrayList<Worker> stuff;



    public Stuff() {
        this.stuff = new ArrayList<Worker>();
    }

    public Worker getStuff(int i) {
        return stuff.get(i);
    }

    @Override
    public String toString() {
        String temp = "Staff ";
        for (Worker worker:stuff) {
                  temp += "\n"+worker;
                }
         return temp;
         }

    public void setStuff(ArrayList<Worker> stuff) {
        this.stuff = stuff;
    }

    public void Add(Worker worker) {

        stuff.add(worker);
    }

    public void sortBySalary() {
        Collections.sort(stuff, Worker.BySalary);
    }


}




