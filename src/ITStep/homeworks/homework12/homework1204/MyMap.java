package ITStep.homeworks.homework12.homework1204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by roman on 21.11.2016.4. Написать программу, которая считывает сроку с клавиатуры.
 * -После этого создается Map в котором ключи - это буквы, значения - это количество повторений этой буквы в данной строке.
 * -Вычеслить значения и записать в Map. После этого распечатать map на экран.
 */

public class MyMap {

    public void fillingMyMap() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку:");

        String string = reader.readLine();

        Map<Character, Integer> myMap = new HashMap<>();

        char key;
        char[] temp = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            int value = 0;
            key = temp[i];
            for (char element : temp) {
                if (element == key) value++;
            }
            myMap.put(key, value);
        }
        System.out.println(myMap);
    }

    public MyMap() throws IOException {
    }
}
