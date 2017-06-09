package ITStep.homeworks.homework10.homework1003;

/**
 * Created by roman on 25.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Executors.newNestedExecutor().execute();
        Executors.newInnerExecutor().execute();
        Executors.newLocalExecutor().execute();
        Executors.newAnonymousExecutor().execute();
    }
}
