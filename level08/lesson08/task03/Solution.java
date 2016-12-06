package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        HashMap<String,String> map = createMap();

        System.out.println(getCountTheSameFirstName(map,"Саша"));
        System.out.println(getCountTheSameLastName(map,"Бирюков"));
        //System.out.println(map);
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Бирюков","Руслан");
        hashMap.put("Иванов","Петя");
        hashMap.put("Петров","Саша");
        hashMap.put("Сидоров","Вася");
        hashMap.put("Сидоренко","Ваня");
        hashMap.put("Петренко","Саша");
        hashMap.put("Федоренко","Макс");
        hashMap.put("Сиротенко","Антон");
        hashMap.put("Емельянов","Толя");
        hashMap.put("Небирюков","Саша");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i=0;
        for (Map.Entry<String,String> s: map.entrySet())
        {
            if (s.getValue().equals(name)) {i++;}
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        return map.containsKey(lastName) ? 1:0;
    }
}
