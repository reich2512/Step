package ITStep.homeworks.homework13.homework1301;

/**
 * Created by roman on 02.12.2016.
 * 1. Задача на рефлексию:
 * - Создать класс Holder с приватным строковым полем word.
 * - Внутри создать приватный конструктор, который инициализирует это поле.
 * - Так же внутри создать приватный метод show, который принимает число N и выводит на экран значение поля word N раз.
 * - Создать класс Test, в котором создать метод main.
 * - В методе main нужно создать объект класса Holder и вызвать метод show.
 */

public class Holder {

    private String word = "Hi";

    private void show(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    public Holder() {
    }

    public void setWord(String word) {
        this.word = word;
    }

    private Holder(String word) {
        this.word = word;
    }
}
