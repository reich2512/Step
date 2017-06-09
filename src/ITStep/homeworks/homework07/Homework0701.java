package ITStep.homeworks.homework07;

import java.util.Arrays;

/**
 * Created by roman on 06.10.2016.
 * 1. Написать метод, который принимает массив и возвращает перевернутый массив
 * (строки первого будут как столбцы второго, а столбцы как строки).
 */
public class Homework0701 {

    public static int [][] fillingArray(int x, int y){ //создаем, заполняем и возвращаем начальный массив

        int [][] fillingArray = new int[x][y];

        int arrayElement = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                fillingArray[i][j] = arrayElement;
                arrayElement++;
            }
        }
        return fillingArray;
    }

    public static int [][] turnArray(int [][] fillinfArray, int x, int y){ //транспонируем начальный массив
                                                                           //и возвращаем уже развернутый массив
        int [][] turnArray = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                turnArray[i][j] = fillinfArray [j][i];
                    }
                }
        return turnArray;
    }

    public static void main(String[] args) {

        int x = 4;
        int y = 3;

        System.out.println(Arrays.deepToString(fillingArray(x, y)));
        System.out.println(Arrays.deepToString(turnArray(fillingArray(x, y), x, y)));
    }
}
