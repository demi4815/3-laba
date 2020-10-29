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

    //Position pos = new Position(n);

    protected void init()
    {
        for (int i = 0; i < n; i++)
        {
            list.add(new Object());
        }
    }

    protected void insertTest(int index)
    {
        if (index == 0)
        {
            for (int i = 0; i < n; i++)
            {
                list.add(0, new Object());
            }
        }

        else if (index == n)
        {
            for (int i = 0; i < n; i++)
            {
                list.add(n, new Object());

            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                list.add(index, new Object());
            }
        }
    }


    protected void getTest(int index)
    {
        Object object;
        if (index == 0)
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(0);
            }
        }

        else if (index == n)
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(n);
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                object = list.get(index);
            }
        }
    }

    protected void removeTest(int index)
    {
        if (index == 0)
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(0);
            }
        }

        else if (index == n)
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(n);
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                list.remove(index);
            }
        }
    }

    protected long getTime(int k, int index)
    {
        Date currentTime = new Date();

        switch (k) {
            case 1 -> insertTest(index);
            case 2 -> getTest(index);
            case 3 -> removeTest(index);

        }

        Date newTime = new Date();
        long difference = newTime.getTime() - currentTime.getTime();

        return difference;

    }


}
