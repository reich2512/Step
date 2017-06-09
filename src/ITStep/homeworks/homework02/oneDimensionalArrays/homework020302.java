package ITStep.homeworks.homework02.oneDimensionalArrays;

import java.util.Random;

/**
 * Created by roman on 12.09.2016.
 * Найти максимальный элемент массива
 */
public class homework020302 {
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
        int max = 0;
        for (int i = 0; i < 10; i++)
            if (mass[i] > max)
            {
                max = mass[i];
                index = i;
            }
        System.out.println();
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("Индекс максимального элемента массива - " + index);
    }
}
