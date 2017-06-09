package ITStep.homeworks.homework11;

import java.util.Random;

/**
 * Created by roman on 23.11.2016.
 * 3. Создать класс Worker который можно использовать в try-with-resources (вспомните, что для этого надо).
 * 4. У этого класса сделайте метод void work(), который будет рандомно то бросать объект вашего непроверяемого исключения, то не бросать.
 * 5. Метод, который отвечает за закрытие :) в классе Worker должен рандомно то бросать объект вашего проверяемого исключения, то не бросать.
 */
public class Worker implements AutoCloseable {

    public void work() throws MyExceptionChecked {

        Random random = new Random();
        int x = random.nextInt(2);
        if (x == 0) {
            MyExceptionChecked myExceptionChecked = new MyExceptionChecked();
            throw myExceptionChecked;
        }
    }

    @Override
    public void close() throws MyExceptionChecked {

        Random random = new Random();
        int x = random.nextInt(2);
        if (x == 0) {
            MyRuntimeExceptionUnchecked myRuntimeExceptionUnchecked = new MyRuntimeExceptionUnchecked();
            throw myRuntimeExceptionUnchecked;
        }
    }
}