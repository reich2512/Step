package ITStep.homeworks.homework12.homework1205;

import java.util.LinkedList;

/**
 * Created by roman on 20.11.2016.5. Создать класс MyStack, который будет симулировать работу стека. Принцип LIFO.
 * -У класса должен быть конструктор, в который передаем максимальный размер стека.
 * -У класса в качестве хранилища должна быть подходящая колллекция. Думаем, какая структура будет максимально подходить для этой задачи.
 * -У класса должен быть методы добавить (возвращает булин, добавилось или нет).
 * -У класса должен быть метод забрать (возвращать null, если нечего брать).
 * -Тип элементов вашего класса - String.
 * Optional(сделайте универсальный генерик тип, чтобы можно было использовать ваш стек не только для String)
 */

public class MyStringStack {

    int capasity;

    LinkedList<String> linkedList = new LinkedList<>();

    public MyStringStack(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "linkedList = " + linkedList;
    }

    public boolean add(String value) {
        if (linkedList.size() < capasity) {
            linkedList.offerLast(value);
            return true;
        } else return false;
    }

    public String remove() {
        if (linkedList.isEmpty()) {
            return null;
        } else return linkedList.pollLast();
    }

    public int size() {
        return linkedList.size();
    }
}


