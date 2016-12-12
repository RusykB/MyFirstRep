package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        int findIndx=0;
        int nextIndx=findIndx;
        String tmpString=array[findIndx];
        while (nextIndx+1<array.length)
        {
            for (int i = nextIndx; i < array.length; i++)
            {
                if (!isGreaterThan(array[i], tmpString))
                {
                    findIndx = i;
                    tmpString=array[i];
                }
            }
            if (findIndx>nextIndx) swap(array, nextIndx,findIndx);

            nextIndx++;
            findIndx=nextIndx;
            tmpString=array[findIndx];
        }

    }

    public static void sortB(String[] array)
    {
        //сортируем методом пузырька, используя метод сверки
        //между собой для каждых 2 строк
        for (int i=0; i<array.length-1;){
            int s = i+1;
            String temp = null;
            //сначала отправляем первое и второе значение на сверку
            if(isGreaterThan(array[i], array[s])){
                temp = array[s];
                array[s]=array[i];
                array[i]=temp;
                if (i>0) i--;
            }
            else i++;

        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
    public static void swap(String[] array,int indxF, int indxL)
    {
        String tmpStr=array[indxF];
        array[indxF]=array[indxL];
        array[indxL]=tmpStr;
    }
}
