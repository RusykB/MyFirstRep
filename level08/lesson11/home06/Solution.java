package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Петя",true,8,null);
        Human child2 = new Human("Вася",true,10,null);
        Human child3 = new Human("Даша",false,5,null);
        Human father = new Human("Саша",true,40, new ArrayList<Human>(Arrays.asList(child1,child2,child3)));
        Human mother = new Human("Маша",false,35, new ArrayList<Human>(Arrays.asList(child1,child2,child3)));
        Human grandMotherFather = new Human("Дуся",false,65,new ArrayList<Human>(Arrays.asList(father)));
        Human grandFatherFather = new Human("Витя",true,70,new ArrayList<Human>(Arrays.asList(father)));
        Human grandMotherMother = new Human("Лена",false,67,new ArrayList<Human>(Arrays.asList(mother)));
        Human grandFatherMother = new Human("Серж",true,72,new ArrayList<Human>(Arrays.asList(mother)));

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFatherFather.toString());
        System.out.println(grandFatherMother.toString());
        System.out.println(grandMotherFather.toString());
        System.out.println(grandMotherMother.toString());

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children= new ArrayList<>();

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            if (children!=null) this.children=children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
