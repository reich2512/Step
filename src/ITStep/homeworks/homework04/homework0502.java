package ITStep.homeworks.homework04;

/**
 * Created by roman on 15.09.2016.
 * В переменной n хранится натуральное двузначное число. Создайте программу,
 вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class homework0502 {
    public static void main(String[] args) {

        int n = 42;

        int x = n % 10;
        int y = (n - x) / 10;
        int r = x + y;

        System.out.println(r);
    }
}
