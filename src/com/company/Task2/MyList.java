package com.company.Task2;

import java.util.Arrays;

public class MyList implements IMyList {
    private int[] MyList = new int[0];

    private int index = 0;

    @Override
    public String toString() {
        return
                "MyList=" + Arrays.toString(MyList) ;
    }
    @Override
    public void add(int element)
    {
        int[] temp;
        temp = Arrays.copyOf(MyList,MyList.length+1);
        temp[index++] = element;
        MyList = Arrays.copyOf(temp,temp.length);
    }

    @Override
    public int get(int index)
    {
        if (index > this.index - 1 || index < 0) { throw new RuntimeException("index out of bound"); }
        return MyList[index];

    }
    @Override
    public void DelAll(){
        MyList = Arrays.copyOf(MyList,0);
    }




    @Override
    public void DelByIndex(int index)
    {
        if (index > this.index - 1 || index < 0) { throw new RuntimeException("index out of bound"); }
        else {
        MyList[index]=0;
        for (int i = index; i < MyList.length-1; i++) {
            MyList[i] = MyList[i+1];
        }
        MyList = Arrays.copyOf(MyList,MyList.length-1);
        }

    }

    @Override
    public void ReadOnlySize() {
        System.out.println(MyList.length+" - size of MyList");
    }

}
