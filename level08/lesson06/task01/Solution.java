package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
 public static void main(String[] args) throws Exception
 {

    createArrayList();
    createLinkedList();

 }

    public static Object createArrayList ()
        {
            ArrayList arrayList = new ArrayList();
            return arrayList;
        }

    public static Object createLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }


}
