package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] N = new int[5];

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        N[0]=Integer.parseInt(reader.readLine());
        N[1]=Integer.parseInt(reader.readLine());
        N[2]=Integer.parseInt(reader.readLine());
        N[3]=Integer.parseInt(reader.readLine());
        N[4]=Integer.parseInt(reader.readLine());
        Arrays.sort(N);
        System.out.println(N[0]);
        System.out.println(N[1]);
        System.out.println(N[2]);
        System.out.println(N[3]);
        System.out.println(N[4]);
    }
}
