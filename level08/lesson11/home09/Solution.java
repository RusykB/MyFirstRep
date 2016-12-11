package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.HashMap;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("DECEMBER 30 2000"));

/*    нужно было воспользоваться этим, а не плодить сущности....

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date myDate = format.parse("JANUARY 2 2016");
        System.out.println(myDate);
*/
    }

    public static boolean isDateOdd(String date)
    {

        //Calendar tmptttt = Calendar.getInstance();
        //tmptttt.setTime(Calendar.);

        Calendar tmpDate = Calendar.getInstance();
        Calendar tmpDateStart = Calendar.getInstance();
        String[] arrDate = date.split(" ");

        tmpDate.set(Integer.parseInt(arrDate[2]),indxmonth(arrDate[0]),Integer.parseInt(arrDate[1]));
        tmpDateStart.set(Integer.parseInt(arrDate[2]),Calendar.JANUARY,1);

        tmpDate.setTimeInMillis(tmpDateStart.getTimeInMillis()-tmpDate.getTimeInMillis());
        return (((long)(tmpDate.getTimeInMillis()/86400000))%2)==0 ? true: false;
    }

    public static int indxmonth (String nameMonth)
    {
        HashMap<String,Integer> mapMonth= new HashMap<String,Integer>();
        mapMonth.put("JANUARY",Calendar.JANUARY);
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

        return mapMonth.get(nameMonth);
    }
}
