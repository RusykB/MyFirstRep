package com.javarush.test.level09.lesson08.task05;


/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution
{
    public static int i=0;

    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try
        {
            if (i==0) obj.method1();
            if (i==1) obj.method2();
            if (i==2) obj.method3();
        }catch (NumberFormatException e)
        {
            printStack(e);
        }catch (IndexOutOfBoundsException e)
        {
            i++;
            printStack(e);
            processExceptions(obj);
        }catch (NullPointerException e)
        {
            i++;
            printStack(e);
            processExceptions(obj);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
