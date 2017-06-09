package ITStep.homeworks.Calculator.Calculation;

import java.io.IOException;
import java.util.regex.Matcher;

import static ITStep.homeworks.Calculator.Calculation.Validator.pt;

/**
 * Created by roman on 18.11.2016.
 * 9. Создать еще один класс - валидатор, с методом валидейт, он будет вызываться внутри класса калькулятор в калькулейте.
 * И будет проверять является ли строка корректным выражением для вычисления.
 */

public class Calculator {

    private Validator validator = new Validator();

    public void calculation() throws IOException {

        String validString = validator.validationString();
        Matcher m = pt.matcher(validString);
        boolean b = m.matches();

        double n1 = Integer.parseInt(m.group(1));
        double n2 = Integer.parseInt(m.group(3));
        String operator = m.group(2);

        System.out.println("первое число: " + n1);
        System.out.println("второе число: " + n2);
        System.out.println("оператор: " + operator);

        Operation operation = Operation.takeOnValue(operator);
        double result = operation.action(n1, n2);

        System.out.println("Результат: " + result);
    }
}
