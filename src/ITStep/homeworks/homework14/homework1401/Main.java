package ITStep.homeworks.homework14.homework1401;

import java.time.LocalDateTime;

/**
 * 1. Сериализация.
 - Создать класс Entity с полями: int id, String name, String created, String changed, int changesCounter;
 - поле created хранит дату создания объекта в виде строки (формать выбрать по желанию);
 - поле changed содержит дату последнего изменения объекта (каждый раз когда изменяется поле name или id перезаписываем эту дату);
 - создать метод getCreateDateTime - должен вернуть объект типа LocalDateTime с датой создания.
 - создать метод getLastChangesInterval - должен вернуть объект подходящего типа (можно взять что-то из java.time либо вручную делать на миллисекундах),
 - который содержит кол-во прошедшего времени прошедшего с момента последнего изменения до сейчас. (сколько дней, часов, минут и тд прошло).
 - создать геттеры для id, name и changesCounter
 - изменять извне можно только поля id и name;
 - переопределить toString, должен красиво выводить данные о объекте.
 - класс должен быть сериализуемым. Как простым способом, так и расширенным.
 - создать класс Main, в котором есть метод main. В этом методе создать объект класса Entity, изменить его несколько раз, вывести на экран.
 - Сериализовать в байтовый массив, десериализовать из него обратно, еще раз вывести на экран.
 - Вывести на экран дату создания и интервал времени, прошедший после последнего изменения этого объекта.
 - поле changesCounter не должно сериализоваться.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Entity entity = new Entity(1, "First");

        System.out.println(entity);

        LocalDateTime date = LocalDateTime.now();

        Thread.sleep(5000);

        entity.setId(2);

        System.out.println(entity.getChanged());

        System.out.println(entity);

        Thread.sleep(5000);

        entity.setName("Second");

        System.out.println(entity.getChanged());

        System.out.println(entity);

        System.out.println(entity.getChangesCounter());
    }
}
