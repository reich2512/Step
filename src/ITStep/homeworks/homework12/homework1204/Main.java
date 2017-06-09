package ITStep.homeworks.homework12.homework1204;

import java.io.IOException;

/**
 * Created by roman on 20.11.2016.
 * 4. Написать программу, которая считывает сроку с клавиатуры.
 * -После этого создается Map в котором ключи - это буквы, значения - это количество повторений этой буквы в данной строке.
 * -Вычеслить значения и записать в Map. После этого распечатать map на экран.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        MyMap myMap = new MyMap();

        myMap.fillingMyMap();
    }
}
