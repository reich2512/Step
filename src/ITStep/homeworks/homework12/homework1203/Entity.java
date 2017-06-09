package ITStep.homeworks.homework12.homework1203;

/**
 * Created by roman on 20.11.2016.
 * 3. Создать свой класс Entity
 * -Внутри него есть поля int id, String name,
 * -Написать компаратор(сравниватель) класс для нашего Entity класса.
 * -Сравниваем данные по всем полям.
 */

public class Entity implements Comparable<Entity> {

    int id;
    String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Entity o) {
        if (id > o.id) {
            return 1;
        } else if (id < o.id) {
            return -1;
        }
        return name.compareTo(o.name);
    }
}
