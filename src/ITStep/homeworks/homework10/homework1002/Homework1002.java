package ITStep.homeworks.homework10.homework1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by roman on 07.11.2016.
 * 2. Задача по строкам. Анограммы. Слова, которые содержат одинаковый набор букв. Пример: Бокал - Колба.
 * - Пользователь вводит с клавиатуры набор слов. Слова разделяются запятыми. Могут быть пробелы, но они не учитываются как часть слов.
 * - программа должна вывести на экран все уникальные пары слов.
 * - программа не чуствительна к регистру букв (А == а и тд.)
 * Пример  строки: Олень, Марка, Указ, Рак, металл, рамка, ЗНАК, КАРМА.
 * Вывод должен быть таким: МАРКА - РАМКА, МАРКА - КАРМА, РАМКА - КАРМА.
 */
public class Homework1002 {

    public static void stringOperations(String inputString) {

        String temp = (inputString.replace(" ", "")).toUpperCase();
        String[] aTemp = temp.split(",");

        for (int i = 0; i < aTemp.length - 1; i++) {
            for (int j = i + 1; j < aTemp.length; j++) {
                byte[] tempBytesI = aTemp[i].getBytes();
                byte[] tempBytesJ = aTemp[j].getBytes();
                int sumI = 0;
                for (Byte I : tempBytesI) {
                    sumI = sumI + I;
                }
                int sumJ = 0;
                for (Byte J : tempBytesJ) {
                    sumJ = sumJ + J;
                }
                if (sumI == sumJ) {
                    System.out.print(aTemp[i] + " - " + aTemp[j] + ", ");
                }
            }
        }
    }

    public static String inputString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        boolean b;
        do {
            System.out.println("Ведите слова для сравнения в формате: слово1, слово2, ... словоN");
            string = reader.readLine();
            Pattern pt = Pattern.compile(
                    "([,]*" +
                            "([\\s])*" + "[a-zA-ZА-Яа-я]{2,}" + "([\\s])*" +
                            "[,]*" +
                            "([\\s])*" + "([a-zA-ZА-Яа-я]){2,}" + "([\\s])*)*");
            Matcher m = pt.matcher(string);
            b = m.matches();
        } while (!b);
        return string;
    }

    public static void main(String[] args) throws IOException {
//        String test = "Олень, Марка, Указ, Рак, металл, рамка, ЗНАК, КАРМА";

        stringOperations(inputString());
    }
}
