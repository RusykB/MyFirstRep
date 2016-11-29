package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        int maxI=array[0];
        int minI=maxI;
        int maxIndx=0;
        int minIndx=0;

        int startIndx = 0;
        int endIndx = array.length-1;

        while (startIndx<endIndx)
        {
            for (int i = startIndx; i <= endIndx; i++)
            {
                if (maxI < array[i])
                {
                    maxI = array[i];
                    maxIndx = i;
                }
                if (minI > array[i])
                {
                    minI = array[i];
                    minIndx = i;
                }
            }
            array[maxIndx] = array[startIndx];
            array[startIndx] = maxI;
            array[minIndx] = array[endIndx];
            array[endIndx] = minI;
            endIndx--;
            startIndx++;
            maxI=array[startIndx];
            minI=maxI;
        }
    }

}
