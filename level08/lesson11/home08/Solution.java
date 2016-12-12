package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        int[] tmpArray = new int[array.length];
        Arrays.sort(array);
        int arrLenindx = array.length/2;
        for (int i=0;i<arrLenindx;i++)
        {
            swap(array,i,array.length-1-i);
        }
    }

    public static void swap(int[] array, int indx1, int indx2)
    {
        int tmpInt;
        tmpInt=array[indx1];
        array[indx1]=array[indx2];
        array[indx2]=tmpInt;
    }
}
