package ITStep.homeworks.homework12.homework1202;

/**
 * Created by roman on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "a", "aaa");
        User user2 = new User(1, "a", "aa");

        System.out.println(user1.compareTo(user2));

    }
}
