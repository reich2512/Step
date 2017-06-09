package ITStep.homeworks.homework02.oneDimensionalArrays;

import java.util.Random;

/**
 * Created by roman on 12.09.2016.
 * Найти минимальный элемент массива
 */
public class homework020301 {
    public static void main(String[] args) {

        int mass[] = new int[10];
        for (int i = 0; i < 10; i++)
        {
            Random r = new Random();
            int x = (r.nextInt()/10000000);
            System.out.print("Random = " + x + " ");
            mass[i] = x;
        }
        int index = 0;
        int min = mass[0];
        for (int i = 1; i < mass.length; i++)
            if (mass[i] < min)
            {
                min = mass[i];
                index = i;
            }
        System.out.println();
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Индекс минимального элемента массива - " + index);
    }
}
