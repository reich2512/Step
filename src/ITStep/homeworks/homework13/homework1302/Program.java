package ITStep.homeworks.homework13.homework1302;

import java.util.Arrays;

/**
 * Created by roman on 02.12.2016.
 * 2. Задача на generic'и:
 * - Дописать типизированную очередь, которую я начал делать на уроке.
 * - У очереди должно быть 3 метода: add (Добавляет элемент в конец), get (забирает элемент с начала), size (возвращает текущий размер).
 * - Если очередь пустая, get возвращает null.
 * - Очередь должна работать для любого типа, ничего готового не ипользовать, все пишем свое.
 */

public class Program {
    public static void main(String[] args) {

        MyTypedQueue<String> myTypedQueue = new MyTypedQueue<>();

        myTypedQueue.add("one");
        myTypedQueue.add("two");
        myTypedQueue.add("three");
        myTypedQueue.add("four");

        System.out.println(myTypedQueue.size());

        System.out.println(myTypedQueue.get());
        System.out.println(myTypedQueue.size());
        System.out.println(myTypedQueue.get());
        System.out.println(myTypedQueue.size());
        System.out.println(myTypedQueue.get());
        System.out.println(myTypedQueue.size());
        System.out.println(myTypedQueue.get());
        System.out.println(myTypedQueue.size());
    }
}
