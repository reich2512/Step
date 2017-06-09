package ITStep.homeworks.homework10.homework1003;

/**
 * Created by roman on 07.11.2016.
 * 3. Задача на внутренние классы.
 * - Создать интерфейс Executable. Создать класс Executors, внутри которого сделать 4 реализации интерфейса Executable.
 * - У интерфейса Executable есть один метод - execute() - выводит на экран слово - тип внетреннего класса. Пример - "nested" и тд.
 * - Каждая из реализаций должна возвращаться в виде объекта при помощи вызова метода. Для каждой реализации свой метод.
 * - У всех методов одинаковый возвращаемый тип значения.
 * - Запретить какие либо виды создания экземпляра класса Executors. Это "утильный" класс. Как Arrays.
 * - Методы можно назвать как-то так "newNestedExecutor" и тд.
 * Должно быть еще четыре метода которые будут возвращать экземпляры этих внутренних классов, для каждого класса свой метод(вощвращаемое значение этих методов Excecutible)
 * - С реализацией обычного внутреннего класса могут возникнуть трудности. Найдите выход. Главное чтоб он был обычным внутренним, а где это будет - без разницы.
 */

class Executors {

    private Executors() {
    }

    public static Executable newNestedExecutor() {
        return new Nested();
    }

    public static Executable newInnerExecutor() {
        Executors.Nested nested = new Executors.Nested();
        return nested.new Inner();
    }

    public static Executable newLocalExecutor() {
        class Local implements Executable {
            @Override
            public void execute() {
                System.out.println("Local");
            }
        }
        return new Local();
    }

    public static Executable newAnonymousExecutor() {

        return new Executable() {
            @Override
            public void execute() {
                System.out.println("Anonymous");
            }
        };
    }


    public static class Nested implements Executable {

        @Override
        public void execute() {
            System.out.println("Nested");
        }

        public class Inner implements Executable {
            @Override
            public void execute() {
                System.out.println("Inner");
            }
        }
    }
}
