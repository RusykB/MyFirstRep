package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        HashMap<String,Integer> mapMonth= new HashMap<String,Integer>();
        mapMonth.put("JANUARY", Calendar.JANUARY);
        mapMonth.put("FEBRUARY",Calendar.FEBRUARY);
        mapMonth.put("MARCH",Calendar.MARCH);
        mapMonth.put("MAY",Calendar.MAY);
        mapMonth.put("APRIL",Calendar.APRIL);
        mapMonth.put("JUNE",Calendar.JUNE);
        mapMonth.put("JULY",Calendar.JULY);
        mapMonth.put("AUGUST",Calendar.AUGUST);
        mapMonth.put("SEPTEMBER",Calendar.SEPTEMBER);
        mapMonth.put("OCTOBER",Calendar.OCTOBER);
        mapMonth.put("NOVEMBER",Calendar.NOVEMBER);
        mapMonth.put("DECEMBER",Calendar.DECEMBER);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameMonth = reader.readLine();

        System.out.println(nameMonth + " is " + (mapMonth.get(nameMonth.toUpperCase())+1) + " month");

    }

}
