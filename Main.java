package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {

        int n = 30000;
        int mid = n / 2;

        GeneralMethods testArray = new GeneralMethods(new ArrayList(), n);
        GeneralMethods testLinked = new GeneralMethods(new LinkedList(), n);

        System.out.println("________________________");
        for(int i = 1; i <= 6; i++)
        {
            switch (i) {
                case 1 -> System.out.println("Для метода add: \n");
                case 2 -> System.out.println("Для метода get: \n");
                case 3 -> System.out.println("Для метода remove: \n");
                case 4 -> System.out.println("Для метода set: \n");
                case 5 -> System.out.println("Для метода clear: \n");
                case 6 -> System.out.println("Для метода toArray: \n");

            }

            System.out.println("Для позиции в начале: ");

            System.out.println("ArrayList: " + testArray.getTime(i, 0));
            System.out.println("LinkedList: " + testLinked.getTime(i, 0));

            System.out.println("\n Для середины: ");

            System.out.println("ArrayList: " + testArray.getTime(i, mid));
            System.out.println("LinkedList: " + testLinked.getTime(i, mid));

            System.out.println("\n Для позиции в конце: ");

            System.out.println("ArrayList: " + testArray.getTime(i, n));
            System.out.println("LinkedList: " + testLinked.getTime(i, n));

            System.out.println("________________________");

        }


    }


}
