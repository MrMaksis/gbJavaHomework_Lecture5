package ru.geekBrains.homework_6;

import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
        int count = 5;
        //Создайте множество
        HashSet<Cat> cats = new HashSet<>();

        //Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
        for (int i = 0; i < count; i++){
            cats.add(new Cat("Vaso", 3.5f));
        }

        //Убедитесь, что все они сохранились во множество.
        if(cats.size() > 0)
            System.out.println("Убедились!");

        int i = 0;
        //Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
        for (Cat cat : cats) {
            System.out.println(cat);
            i++;
        }
        if(i != count) System.out.printf("Дубликаты удалились! %d", i);
    }

}

