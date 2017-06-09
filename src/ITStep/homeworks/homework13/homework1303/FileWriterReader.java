package ITStep.homeworks.homework13.homework1303;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * - После того как все создано, считываем с клавиатуры 5 строк и записываем их в этот файл.
 * - После этого читаем эти строки из файла и выводим на экран в обратном порядке (сначала последнюю строку, потом предпоследнюю и тд.).
 * - При чтении из файла использовать try-with-resources.
 */

class FileWriterReader {

    void writeReadFile(File filePath) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + (i + 1) + " для записи в файл:");
            String writeString = bufferedReader.readLine();
            writer.write(writeString + "\n");
        }
        writer.flush();
        writer.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<String> list = new ArrayList<>();
            String readString = reader.readLine();
            while (readString != null) {
                list.add(readString);
                readString = reader.readLine();
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
