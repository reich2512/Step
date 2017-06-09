package ITStep.homeworks.homework08;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by roman on 16.10.2016.
 * 3. Еаписать метод, который принимает строку в виде массива байт в одной кодировке, а возвращает в другой.
 * Кодировки выбрать по желанию.
 * Аргументы метода: 1 - массив байт, 2 - строка с названием входящей кодировки, 3 - строка с названеим исходящей кодировки.
 */
public class Homework0803 {

    public static byte[] reEncoding(byte[] byteArray, String inputCharset, String outputCharset) throws UnsupportedEncodingException {

        String inputEncodingString = new String(byteArray, inputCharset);
        System.out.println(inputEncodingString);
        byte[] outputByteArray = inputEncodingString.getBytes(outputCharset);
        return outputByteArray;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "String Привет";
        String inputCharset = "UTF-8";
        String outputCharset = "windows-1251";
        byte[] byteArray = str.getBytes(inputCharset);

        System.out.println(Arrays.toString(reEncoding(byteArray, inputCharset, outputCharset)));
    }

}
