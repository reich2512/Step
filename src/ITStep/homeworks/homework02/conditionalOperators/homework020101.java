package ITStep.homeworks.homework02.conditionalOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by roman on 11.09.2016.
 * Если а – четное посчитать а*б, иначе а+б
 */
public class homework020101 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a % 2 == 0) {
            int result = a * b;

            System.out.println("Число а = " + a + " - четное. Результат равен " + result);
        }
        else {
            int result = a + b;

            System.out.println("Число а = " + a + " - нечетное. Результат равен " + result);
        }
    }
}
