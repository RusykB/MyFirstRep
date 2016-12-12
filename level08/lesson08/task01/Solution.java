package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(createSet().size());
    }

    public static HashSet<String> createSet()
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Леонид");
        hashSet.add("Лобсорйтер");
        hashSet.add("Лобсортери");
        hashSet.add("Лобрпастер");
        hashSet.add("Лобсортер");
        hashSet.add("Лобвастер");
        hashSet.add("Лобстрпер");
        hashSet.add("Лобсваптер");
        hashSet.add("Лобсчсмитер");
        hashSet.add("Лобитьпастер");
        hashSet.add("Лобсукетер");
        hashSet.add("Лобстекунер");
        hashSet.add("Лобекнстер");
        hashSet.add("Лобкгестер");
        hashSet.add("Лобщгшщестер");
        hashSet.add("Лобаопростер");
        hashSet.add("Лобапрывастер");
        hashSet.add("Лоыпаыбстер");
        hashSet.add("Лобсрвпрватер");
        hashSet.add("Леонид2");

        return hashSet;
    }
}
