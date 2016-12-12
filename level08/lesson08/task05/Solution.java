package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map= createMap();

        System.out.println("!!!    " + map);

        removeTheFirstNameDuplicates(map);

        System.out.println("0000    "+map);
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        String tmpKey="";
        String tmpValue="";
        int sizePrev=0;
        HashMap<String,String> tmphashMap = new HashMap<String,String>(map);
        for (Map.Entry<String,String> s: tmphashMap.entrySet())
        {
            sizePrev=map.size();
            tmpKey=s.getKey();
            tmpValue=s.getValue();
            removeItemFromMapByValue(map,tmpValue);
            if ((sizePrev-map.size())==1) {map.put(tmpKey,tmpValue);}
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
