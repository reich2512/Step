package ITStep.homeworks.homework02.cycles;

/**
 * Created by roman on 11.09.2016.
 * Найти сумму четных чисел и их количество в диапазоне от 1 до 99
 */
public class homework020201 {
    public static void main(String[] args) {

        int summa = 0;
        int count = 0;

        for (int i = 1; i < 99; i++) {

            if (i % 2 == 0) {
                summa = summa + i;
                count++;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от 1 до 99 равна " + summa);
        System.out.println("Количество четных чисел в диапазоне от 1 до 99 равно " + count);
    }
}
