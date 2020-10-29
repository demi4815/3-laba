package com.company;

public class Position
{
    int begin;
    int mid;
    int end;

    Position(int n)
    {
        begin = 0;
        mid = n / 2;
        end = n;
    }
}
