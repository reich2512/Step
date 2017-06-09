package ITStep.homeworks.homework08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by roman on 16.10.2016.
 * 1. Ввести 5 строк с клавиатуры и сохранить их в массив.
 * Передать массив в метод, который должен вернуть самую длинную строку из этого масива.
 */
public class Homework0801 {

    public static String calculateMaxLengthString(String[] array) {

        int maxLength = 0;
        String maxLengthString = null;

        for (int i = 0; i < array.length; i++) {
            String sTemp = array[i];
            int temp = sTemp.length();
            if (temp > maxLength) {
                maxLength = temp;
                maxLengthString = array[i];
            }
        }
        return maxLengthString;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = s;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(calculateMaxLengthString(array));
    }
}
