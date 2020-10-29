package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {

        int n = 100000;

        GeneralMethods testArray = new GeneralMethods(new ArrayList(), n);
        GeneralMethods testLinked = new GeneralMethods(new LinkedList(), n);

        for(int i = 1; i <= 4; i++)
        {
            testArray.getTime(i);
            testLinked.getTime(i);
        }

    }


}
