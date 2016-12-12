package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(25);
        integerHashSet.add(5);
        integerHashSet.add(57);
        integerHashSet.add(43);
        integerHashSet.add(45);
        integerHashSet.add(46);
        integerHashSet.add(2);
        integerHashSet.add(9);
        integerHashSet.add(12);
        integerHashSet.add(7567);
        integerHashSet.add(1);
        integerHashSet.add(23);
        integerHashSet.add(33);
        integerHashSet.add(7);
        integerHashSet.add(55);
        integerHashSet.add(66);
        integerHashSet.add(77);
        integerHashSet.add(4);
        integerHashSet.add(88);
        integerHashSet.add(111);

        return integerHashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        HashSet<Integer> tmpSet = new HashSet<Integer>();

        for (Integer i: set)
        {
            if (i<=10) tmpSet.add(i);
        }

        return tmpSet;
    }
}
