package ITStep.homeworks.homework02.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by roman on 12.09.2016.
 * Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
 */
public class homework020204 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int fact = 1;
        int n = Integer.parseInt(reader.readLine());

        for (int i = 2; i <= n; i++)
            fact = fact * i;
        System.out.print("Факториал числа " + n + " равен " + fact);

    }
}
