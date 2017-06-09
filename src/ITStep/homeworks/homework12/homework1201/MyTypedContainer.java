package ITStep.homeworks.homework12.homework1201;

/**
 * Created by roman on 20.11.2016.
 * 1. Создать свой типизированный контейнер.
 * -Внутри контейнера должно быть 3 поля, все три поля имеют генерик тип.
 * -Пользователь должен иметь возможность сделать так, что все три типа будут разные.
 * -Сделать полный конструктор и геттеры.
 */

public class MyTypedContainer<N, A, I> {

    I i;
    N n;
    A a;

    public MyTypedContainer() {
    }

    public MyTypedContainer(I i, N n, A a) {
        this.i = i;
        this.n = n;
        this.a = a;
    }

    public I getI() {
        return i;
    }

    public N getN() {
        return n;
    }

    public A getA() {
        return a;
    }
}
