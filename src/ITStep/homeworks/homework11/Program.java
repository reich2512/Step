package ITStep.homeworks.homework11;

import java.util.Arrays;

/**
 * Created by roman on 23.11.2016.6.
 * 1. Создать 3 СВОИХ класса-ошибки. 1 - проверяемое исключение (checked), 2 - непроверяемое исключение (unchecked), 3 - error.
 * 2. У всех троих должны быть разные наборы конструткоров.
 * 3. Создать класс Worker который можно использовать в try-with-resources (вспомните, что для этого надо).
 * 4. У этого класса сделайте метод void work(), который будет рандомно то бросать объект вашего непроверяемого исключения, то не бросать.
 * 5. Метод, который отвечает за закрытие :) в классе Worker должен рандомно то бросать объект вашего проверяемого исключения, то не бросать.
 * 6. Создаем класс Program у которого есть метод main и метод throwable. Метод throwable ничего не принимает и ничего не возвращает.
 * 7. В методе throwable создать конструкцию try-with-resource. Внутри нее создать экземпляр класса Worker. Вызвать у него метод work.
 * 8. Перехватить летящее исключение. Добавить ему в качестве причины объект вашего Error'а и бросить дальше.
 * 9. В методе main вызвать метод throwable. Окружить вызов конструкцией try-catch. throwable выбрасывает исключение!
 * 0. Словить исключение. Вывести на экран: само исключение, ислючение-причину и подавленое исключение. Если они есть.
 * <p>
 * (optional) В main методе прицепить к try-catch еще и finally. В нем напечатать StackTrace исключения, которое мы ловим, если оно есть.
 * Если его нет, то выводим на экран, что все хорошо.
 */

public class Program {
    public static void main(String[] args) {

        Throwable e = null;
        try {
            throwable();
        } catch (Exception ex) {
            e = ex;
            System.out.println("исключение:" + ex);
            System.out.println("исключение-причина: " + ex.getCause());
            System.out.println("подавленное исключение: " + Arrays.toString(ex.getSuppressed()));
        } finally {
            if (e == null) {
                System.out.println("Все хорошо!");
            } else e.printStackTrace();
        }
    }

    public static void throwable() throws MyExceptionChecked {
        try {
            Worker worker = new Worker();
            worker.work();
        } catch (Exception ex) {
            MyError myError = new MyError();
            ex.initCause(myError);
            throw ex;
        }
    }
}
