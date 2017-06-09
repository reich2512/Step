package ITStep.homeworks.homework07;

import java.util.Arrays;

/**
 * Created by roman on 16.10.2016.
 * 2. Написать метод который принимает пустой двумерный массив строк и одномерный заполненный массив чисел.
 * Метод должен в каждую строку двумерного массива записать один и тот же одномерный массив чисел в виде строк.
 * Метод должен вернуть готовый двумерный массив
 */
public class Homework0702 {

    public static String[][] fillingArray(String[][] doubleArray, int[] array, int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < array.length; j++) {
                doubleArray[i][j] = String.valueOf(array[j]);
            }
        }
        return doubleArray;
    }

    public static void main(String[] args) {

        int x = 4;

        int[] array = {1, 2, 3};

        String[][] doubleArray = new String[x][array.length];

        System.out.println(Arrays.deepToString(fillingArray(doubleArray, array, x)));
    }
}
