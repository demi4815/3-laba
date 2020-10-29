package com.company;

import java.util.Date;
import java.util.List;

public class GeneralMethods
{
//    static int n;
//
//    GeneralMethods(int n)
//    {
//        this.n = n;
//    }

    static int n = 10000;

    static void InsertFirst(List list)
    {
        for (int i = 0; i < n; i++)
        {
            list.add(0, new Object());
        }
    }

    static void InsertInside(List list)
    {
        for (int i = 0; i < n; i++) {
            list.add(new Object());
        }

        for (int i=0; i < 100; i++){
            list.add(n/2, new Object());
        }

    }

    static void getTime(List list, int k)
    {
        Date currentTime = new Date();

        switch (k)
        {
            case 1: InsertFirst(list);
                 break;

            case 2: InsertInside(list);
                break;
        }

        Date newTime = new Date();
        long difference = newTime.getTime() - currentTime.getTime();

        //return difference;

        System.out.println("Результат в миллисекундах: " + difference);
    }


}
