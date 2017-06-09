package ITStep.homeworks.homework04;

/**
 * Created by roman on 15.09.2016.
 * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
 программу, округляющую число n до ближайшего целого и выводящую результат на
 экран.
 */
public class homework0503 {
    public static void main(String[] args) {

        double n = 2.545;

        int r = (int)Math.round(n);

        System.out.println(r);
    }
}
