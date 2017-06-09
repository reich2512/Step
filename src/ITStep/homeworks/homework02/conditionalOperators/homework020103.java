package ITStep.homeworks.homework02.conditionalOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by roman on 11.09.2016.
 * Найти сумму только положительных из трех чисел
 */
public class homework020103 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summa = 0;

        int n[] = new int[3];

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0){
                summa = summa +  n[i];
            }
        }
        System.out.println("Сумма положительных элементов равна " + summa);
    }
}
