package com.company;

import java.util.Date;
import java.util.List;

public class GeneralMethods
{
    private int n;

    private List<Object> list;

    GeneralMethods(List list, int n)
    {
        this.list = list;
        this.n = n;
        init();
    }

    Position pos = new Position(n);

    protected void init()
    {
        for (int i = 0; i < n; i++)
        {
            list.add(new Object());
        }
    }

    protected void insertTest(int index)
    {
        if (pos.begin == index)
        {
            for (int i = 0; i < n; i++)
            {
                list.add(0, new Object());
            }
        }

        else if (pos.mid == index)
        {
            for (int i = 0; i < n; i++)
            {
                list.add(pos.mid, new Object());
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                list.add(pos.end, new Object());
            }
        }
    }


    protected void getTest(int index)
    {
        Object object;
        if (pos.begin == index)
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(0);
            }
        }

        else if (pos.mid == index)
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(pos.mid);
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(pos.end);
            }
        }
    }

    protected void removeTest(int index)
    {
        if (pos.begin == index)
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(0);
            }
        }

        else if (pos.mid == index)
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(pos.mid);
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(pos.end);
            }
        }
    }

    protected void getTime(int k, int index)
    {
        Date currentTime = new Date();

        switch (k) {
            case 1 -> insertTest(index);
            case 2 -> getTest(index);
            case 3 -> removeTest(index);

        }

        Date newTime = new Date();
        long difference = newTime.getTime() - currentTime.getTime();

        //return difference;

        System.out.println("Результат в миллисекундах: " + difference);
    }


}
