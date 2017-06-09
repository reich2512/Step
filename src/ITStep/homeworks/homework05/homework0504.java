package ITStep.homeworks.homework05;

/**
 * Created by roman on 25.09.2016.
 * создайте метод, который будет считать сколько денег получает работник в неделю.
 * Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
 * Условия:
 * 1) Каждый час после 40 считается за полтора.
 * 2) Работник не может работать больше, чем 60 часов в неделю.
 * 3) Работник не может получать меньше 8 долларов в час.\
 */
public class homework0504 {

    public static void payPerWeek(int payPerHour, int hours) {

        if (hours > 60 || payPerHour < 8) {
            System.out.println("Неверные входные параметры!");
        } else {
            int payPerWeek = hours > 40 ? (int) (payPerHour * 40 + ((hours - 40) * 1.5 * payPerHour)) : payPerHour * hours;
            System.out.println(payPerWeek);
        }
    }

    public static void main(String[] args) {

        payPerWeek(10, 60);
    }
}
