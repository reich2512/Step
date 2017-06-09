package ITStep.homeworks.homework08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by roman on 16.10.2016.
 * 2. Ввести с клавиатуры число N. Далее программа запросит N строк, ввест иих тоже с клавиатуры.
 * Занести их в массив и отсортировать массив методом "пузырька". Вывести массив на экран.
 */
public class Homework0802 {

    public static String[] bubbleSortArray(String[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j].length() > array[j - 1].length()) {
                    String temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stringQuantity = Integer.parseInt(reader.readLine());

        String[] array = new String[stringQuantity];

        for (int i = 0; i < stringQuantity; i++) {

            array[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSortArray(array)));
    }
}
