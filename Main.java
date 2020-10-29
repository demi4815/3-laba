package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {

        int n = 100000;

        GeneralMethods testArray = new GeneralMethods(new ArrayList(), n);
        GeneralMethods testLinked = new GeneralMethods(new LinkedList(), n);

        Position pos = new Position(n);


        for(int i = 1; i <= 3; i++)
        {
            testArray.getTime(i, pos.begin);
            testLinked.getTime(i, pos.begin);
        }

        for(int i = 1; i <= 3; i++)
        {
            testArray.getTime(i, pos.mid);
            testLinked.getTime(i, pos.mid);
        }

        for(int i = 1; i <= 3; i++)
        {
            testArray.getTime(i, pos.end);
            testLinked.getTime(i, pos.end);
        }


    }


}
