package ITStep.homeworks.homework12.homework1202;

/**
 * Created by roman on 20.11.2016.
 * 2. Создать свой класс User.
 * -Внутри него есть поля int id, String name, String lastname.
 * -Седалать так, что бы класс был сравниваемый (мог применяться в сортированных структурах данных).
 * -Сравниваем данные по всем полям.
 */
public class User implements Comparable<User> {

    int id;
    String name;
    String lastname;

    public User(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public int compareTo(User o) {
        if (id > o.id) {
            return 1;
        } else if (id < o.id) {
            return -1;
        } else if (name.compareTo(o.name) == 0) {
            return lastname.compareTo(o.lastname);
        }
        return name.compareTo(o.name);
    }
}

