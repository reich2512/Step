package ITStep.homeworks.homework12.homework1205;

/**
 * Created by roman on 20.11.2016.
 * 5. Создать класс MyStack, который будет симулировать работу стека. Принцип LIFO.
 * -У класса должен быть конструктор, в который передаем максимальный размер стека.
 * -У класса в качестве хранилища должна быть подходящая колллекция. Думаем, какая структура будет максимально подходить для этой задачи.
 * -У класса должен быть методы добавить (возвращает булин, добавилось или нет).
 * -У класса должен быть метод забрать (возвращать null, если нечего брать).
 * -Тип элементов вашего класса - String.
 * Optional(сделайте универсальный генерик тип, чтобы можно было использовать ваш стек не только для String)
 */

public class Main {

    public static void main(String[] args) {

        MyStringStack myStringStack = new MyStringStack(3);

        myStringStack.add("first");
        myStringStack.add("second");
        myStringStack.add("third");

        myStringStack.remove();

        System.out.println(myStringStack);
    }
}