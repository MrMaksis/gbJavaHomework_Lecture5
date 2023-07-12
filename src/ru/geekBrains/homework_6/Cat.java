package ru.geekBrains.homework_6;
import java.util.*;

public class Cat {

    public String _name;
    public float _weight;
    public Cat(String name, float weight){
        _name = name;
        _weight = weight;
    }

    //Создайте метод public boolean equals(Object o)
    @Override
    public boolean equals(Object o) {
        Cat cat = (Cat) o;

        //Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
        //То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        if (this._name == cat._name && this._weight == cat._weight) {
            return true;
        }
        else {
            return false;
        }
    }

    //Создайте метод public int hashCode()
    @Override
    public int hashCode() {
        //который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
        return Objects.hash(_name, _weight);
    }
}
