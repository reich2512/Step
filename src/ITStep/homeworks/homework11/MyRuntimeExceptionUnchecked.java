package ITStep.homeworks.homework11;

/**
 * Created by roman on 22.11.2016.
 * Создать 3 СВОИХ класса-ошибки. 1 - проверяемое исключение (checked), 2 - непроверяемое исключение (unchecked), 3 - error.
 * 2. У всех троих должны быть разные наборы конструткоров.
 */

public class MyRuntimeExceptionUnchecked extends RuntimeException {

    public MyRuntimeExceptionUnchecked() {
    }

    public MyRuntimeExceptionUnchecked(String message) {
        super(message);
    }
}
