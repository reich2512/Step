package ITStep.homeworks.homework12.homework1203;

import java.util.Comparator;

/**
 * Created by roman on 20.11.2016.
 * 3. Создать свой класс Entity
 * -Внутри него есть поля int id, String name,
 * -Написать компаратор(сравниватель) класс для нашего Entity класса.
 * -Сравниваем данные по всем полям.
 */

public class EntityComparator implements Comparator<Entity> {

    @Override
    public int compare(Entity o1, Entity o2) {
        return o1.compareTo(o2);
    }
}
