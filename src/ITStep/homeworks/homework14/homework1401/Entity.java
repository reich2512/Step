package ITStep.homeworks.homework14.homework1401;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Создать класс Entity с полями: int id, String name, String created, String changed, int changesCounter;
 * - поле created хранит дату создания объекта в виде строки (формать выбрать по желанию);
 * - поле changed содержит дату последнего изменения объекта (каждый раз когда изменяется поле name или id перезаписываем эту дату);
 * - создать метод getCreateDateTime - должен вернуть объект типа LocalDateTime с датой создания.
 * - создать метод getLastChangesInterval - должен вернуть объект подходящего типа (можно взять что-то из java.time либо вручную делать на миллисекундах),
 * - который содержит кол-во прошедшего времени прошедшего с момента последнего изменения до сейчас. (сколько дней, часов, минут и тд прошло).
 * - создать геттеры для id, name и changesCounter
 * - изменять извне можно только поля id и name;
 * - переопределить toString, должен красиво выводить данные о объекте.
 * - класс должен быть сериализуемым. Как простым способом, так и расширенным.
 */

public class Entity {

    private int id;
    private String name;
    private String created;
    private String changed;
    private int changesCounter;
    private LocalDateTime createdDateTime;
    private String dateFormat = "dd.MM.uuuu HH:mm:ss";

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
        this.created = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
        this.createdDateTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getChanged() {
        return changed;
    }

    public int getChangesCounter() {
        return changesCounter;
    }

    public void setId(int id) {
        this.id = id;
        changed = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
        changesCounter++;
    }

    public void setName(String name) {
        this.name = name;
        changed = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
        changesCounter++;
    }

    public LocalDateTime getLastChangesInterval(){
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime lastChangesInterval = createdDateTime.until(timeNow);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", created = '" + created + '\'' +
                ", changed = '" + changed + '\'' +
                ", changesCounter = " + changesCounter +
                '}';
    }
}
