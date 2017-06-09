package ITStep.homeworks.homework05;

/**
 * Created by roman on 25.09.2016.
 * напишите метод, который будет проверять является ли число палиндромом
 * (одинаково читающееся в обоих направлениях).
 * (Опционально) усовершенствуйте метод для проверки символьной строки.
 */
public class homework0505 {

    public static void checkPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        if (s.equalsIgnoreCase(reversed)) {
            System.out.println(s + " - палиндром");
        } else System.out.println(s + " - не палиндром");
    }

    public static void main(String[] args) {

        String s = "assa";

        checkPalindrome(s);

    }
}
