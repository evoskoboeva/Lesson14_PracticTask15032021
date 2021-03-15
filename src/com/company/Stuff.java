package com.company;

import java.util.ArrayList;

public class Stuff {

    public Stuff(ArrayList<Worker> stuff) {

        this.stuff = stuff;
    }

    ArrayList<Worker> stuff = new ArrayList<>();

    public Stuff() {

        this.stuff = stuff;
    }

    public ArrayList<Worker> getStuff() {
        return stuff;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "stuff=" + stuff +
                '}';
    }

    public void setStuff(ArrayList<Worker> stuff) {
        this.stuff = stuff;
    }

    public  void Add(Worker worker){

        stuff.add(worker);
    }


}




