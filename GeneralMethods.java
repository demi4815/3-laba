package com.company;

import java.util.Date;
import java.util.List;

public class GeneralMethods
{
    private final int n;

    private final List<Object> list;

    GeneralMethods(List list, int n)
    {
        this.list = list;
        this.n = n;
    }

    protected void init(int N)
    {
        for (int i = 0; i < N; i++)
        {
            list.add(new Object());
        }
    }

    protected void insertFirst()
    {
        for (int i = 0; i < n; i++)
        {
            list.add(0, new Object());
        }
    }


    protected void insertInside()
    {
        init(n);

        for (int i = 0; i < 100; i++)
        {
            list.add(n/2, new Object());
        }
    }

    protected void getFirst()
    {
        init(n);

        for (int i = 0; i < 100; i++)
        {
            list.get(0);
        }
    }

    protected void getInside()
    {
        init(n);

        for (int i = 0; i < 100; i++)
        {
            list.get(n/2);
        }
    }

    protected void getTime(int k)
    {
        Date currentTime = new Date();

        switch (k) {
            case 1 -> insertFirst();
            case 2 -> insertInside();
            case 3 -> getFirst();
            case 4 -> getInside();
        }

        Date newTime = new Date();
        long difference = newTime.getTime() - currentTime.getTime();

        //return difference;

        System.out.println("Результат в миллисекундах: " + difference);
    }


}
