package com.javarush.test.level03.lesson04.task05;



/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i=1,i1=1,i2=2,i3=3,i4=4,i5=5,i6=6,i7=7,i8=8,i9=9,i10=10;
        System.out.println(i1);
        System.out.println((i1+i2));
        System.out.println((i1+i2+i3));
        System.out.println((i1+i2+i3+i4));
        System.out.println((i1+i2+i3+i4+i5));
        System.out.println((i1+i2+i3+i4+i5+i6));
        System.out.println((i1+i2+i3+i4+i5+i6+i7));
        System.out.println((i1+i2+i3+i4+i5+i6+i7+i8));
        System.out.println((i1+i2+i3+i4+i5+i6+i7+i8+i9));
        System.out.println((i1+i2+i3+i4+i5+i6+i7+i8+i9+i10));


    }
}