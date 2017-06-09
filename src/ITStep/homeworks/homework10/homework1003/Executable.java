package ITStep.homeworks.homework10.homework1003;

/**
 * Created by roman on 15.11.2016.
 * 3. Задача на внутренние классы.
 * - Создать интерфейс Executable. Создать класс Executors, внутри которого сделать 4 реализации интерфейса Executable.
 * - У интерфейса Executable есть один метод - execute() - выводит на экран слово - тип внетреннего класса. Пример - "nested" и тд.
 * - Каждая из реализаций должна возвращаться в виде объекта при помощи вызова метода. Для каждой реализации свой метод.
 * - У всех методов одинаковый возвращаемый тип значения.
 * - Запретить какие либо виды создания экземпляра класса Executors. Это "утильный" класс. Как Arrays.
 * - Методы можно назвать как-то так "newNestedExecutor" и тд.
 * - С реализацией обычного внутреннего класса могут возникнуть трудности. Найдите выход. Главное чтоб он был обычным внутренним, а где это будет - без разницы.
 */
public interface Executable {
    void execute();
}