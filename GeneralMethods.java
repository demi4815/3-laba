package com.company;

import java.util.Date;
import java.util.List;

/** Класс для сравнения производительности ArrayList и LinkedList.
 * @autor Карина Куликова
 * @version 2.1
 */

public class GeneralMethods
{
    /**
     * Размерность list и количество тестов
     */
    private int n;

    /**
     * List типа Object, который будет тестироваться
     */
    private List<Object> list;

    /**
     * Конструктор - создание нового объекта класса GeneralMethods и инициализация list
     * @param list - объект интерфейса List
     * @param n - размерность list и количество тестов
     */
    GeneralMethods(List list, int n)
    {
        this.list = list;
        this.n = n;
        init();
    }

    /**
     * Инициализация list
     */
    protected void init()
    {
        for (int i = 0; i < n; i++)
        {
            list.add(new Object());
        }
    }

    /**
     * Тест на производительность метода add(), в зависимости от позиции индекса(начало, середина или конец)
     * @param index - позиция
     */
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

    /**
     * Тест на производительность метода get(), в зависимости от позиции индекса(начало, середина или конец)
     * @param index - позиция
     */
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

    /**
     * Тест на производительность метода remove(), в зависимости от позиции индекса(начало, середина или конец)
     * @param index - позиция
     */
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

    /**
     * Тест на производительность метода set(), в зависимости от позиции индекса(начало, середина или конец)
     * @param index - позиция
     */
    protected void setTest(int index)
    {
        Object object = new Object();
        if (index == 0)
        {
            for (int i = 0; i < n; i++)
            {
                list.set(0, object);
            }
        }

        else if (index == n)
        {
            for (int i = 0; i < n; i++)
            {
                list.set(n - 1, object);
            }
        }

        else
        {
            for (int i = 0; i < n; i++)
            {
                list.set(index, object);
            }
        }
    }

    /**
     * Тест на производительность метода clear()
     */
    protected void clearTest()
    {
        list.clear();
    }

    /**
     * Тест на производительность метода toArray()
     */
    protected void toArrayTest()
    {
        Object[] object = list.toArray();
    }


    /**
     * Метод, который вызывает определенный метод для теста и возвращает время, затраченное на тест
     * @param k - номер метода для теста
     * @param index - позиция, для которой будет проводится тест(начало, середина или конец)
     * @return возвращается время, затраченное на тест
     */
    protected long getTime(int k, int index)
    {
        Date currentTime = new Date();

        switch (k) {
            case 1 -> insertTest(index);
            case 2 -> getTest(index);
            case 3 -> removeTest(index);
            case 4 -> setTest(index);
            case 5 -> clearTest();
            case 6 -> toArrayTest();

        }

        Date newTime = new Date();
        long difference = newTime.getTime() - currentTime.getTime();

        return difference;

    }


}
