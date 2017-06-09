package ITStep.homeworks.homework08;

/**
 * Created by roman on 16.10.2016.
 * 5. Написать программу выводящую на экран таблицу умножения,
 * в которой вместо результатов перемножения будут квадратные корни этих результатов перемножений.
 * Формат: 1 символ до точки, 4 после, выравниваем столбцы по левому краю, ширина полная 8 символов. Можно использовать Math.sqrt().
 */
public class Homework0805 {

    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            for (int i = 1; i <= 10; i++) {
                double result = Math.sqrt(((n * i)));
                System.out.printf("%-8.4f", result);
            }
            System.out.println();
        }
    }
}


