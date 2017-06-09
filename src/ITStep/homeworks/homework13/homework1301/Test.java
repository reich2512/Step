package ITStep.homeworks.homework13.homework1301;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by roman on 02.12.2016.
 * 1. Задача на рефлексию:
 * - Создать класс Holder с приватным строковым полем word.
 * - Внутри создать приватный конструктор, который инициализирует это поле.
 * - Так же внутри создать приватный метод show, который принимает число N и выводит на экран значение поля word N раз.
 * - Создать класс Test, в котором создать метод main.
 * - В методе main нужно создать объект класса Holder и вызвать метод show.
 */

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Holder holder = new Holder();

        Class holderClass = Holder.class;

        Class<? extends Holder> aClass = holder.getClass();

        System.out.println(holderClass.getName());

        System.out.println(aClass.getName());

        System.out.println(holderClass.equals(aClass));

        Method show = holderClass.getDeclaredMethod("show", int.class);

        show.setAccessible(true);
        show.invoke(holder,3);

    }
}
