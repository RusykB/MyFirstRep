package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] tmpChr;
        String tmpStr;
        String fullString="";

        for (String tmp:s.split(" "))
        {
            tmpChr=tmp.toCharArray();
            tmpStr=(tmpChr.length==0) ? "":""+tmpChr[0];

            fullString=fullString+tmpStr.toUpperCase()+tmp.replaceFirst("^.?","")+" ";
            //System.out.println(fullString);
        }
        fullString=fullString.replaceFirst(" $","");

        System.out.println(fullString);

    }

}
