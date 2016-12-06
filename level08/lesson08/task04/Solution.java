package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String,Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("June 1 1980"));
        map.put("Бирюков", new Date("September 2 1980"));
        map.put("Иванов", new Date("November 3 1980"));
        map.put("Петров", new Date("December 5 1980"));
        map.put("Сидоров", new Date("July 10 1980"));
        map.put("Сидоренко", new Date("August 11 1980"));
        map.put("Петренко", new Date("October 21 1980"));
        map.put("Федоренко", new Date("March 12 1980"));
        map.put("Сиротенко", new Date("April 17 1980"));
        map.put("Емельянов", new Date("May 19 1980"));

      return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String,Date> tmpHashMap = new HashMap<>();
        for (Map.Entry<String,Date> s: map.entrySet())
        {
            if ((s.getValue().getMonth()>4) && (s.getValue().getMonth()<8)){tmpHashMap.put(s.getKey(),s.getValue());}
        }
        for (String s: tmpHashMap.keySet())
        {
            map.remove(s);
        }
    }
}
