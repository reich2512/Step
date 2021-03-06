package ITStep.homeworks.Calculator;

import ITStep.homeworks.Calculator.Calculation.Calculator;

import java.io.IOException;

/**
 * 4. Калькулятор. Задача будет развиваться от урока к уроку. Сдавать ее можно не в дз, а просто высылать отдельно, я буду направлять куда двигаться.
 * - На оценку дз влиять эта задача не будет, за нее буду давать кристаллы. Или может просто оценка как классная работа. Посмотрим.
 * - Нужно сделать программу калькулятор. Пользователь вводит строку выражения. Например "2 + 7". Нужно чтобы программа вывела результат - 9.
 * - Для начала калькулятор будет поддерживать только 2 оператора: + и -. Операторы сделать как Enum.
 * - Для начала операндов будет только два. В дальнейшем сможем делать и три : x + y - z.
 * - У каждого реализовать метод action(x, y). Который возвращает результат операции над этими операндами.
 * - Воспользоваться этими операторами при подсчете. Так же вам пригодятся некоторые методы стринга, чтобы разбить ее на операнды и оператор.
 * - Ну и не забывайте про метод, который по стрингу дает сам оператор.
 * <p>
 * 7. в методе мейн создаем калькулятор, создаем сканер, считываем строку и отдаем ее калькулятору в метод калькулейт,
 * метод должен вернуть результат, который в мейне выводим на экран
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();

        calculator.calculation();

    }
}
