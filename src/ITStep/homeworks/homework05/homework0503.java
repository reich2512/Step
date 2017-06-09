package ITStep.homeworks.homework05;

/**
 * Created by roman on 25.09.2016.
 * Создайте метод подсчёта общей суммы покупки телевизора в кредит.
 * Расчёт бедет вестись на основе начальной суммы покупки и годового процента,
 * которые приходят как входящие параметры метода.
 */
public class homework0503 {

    public static void stoimostTVVKredit(int price, int percent){

        int summa = (price + (price / 100 * percent));
        System.out.println(summa);
    }

    public static void main(String[] args) {

        stoimostTVVKredit(100, 25);
    }
}
