package ITStep.homeworks.homework13.homework1303;

import java.io.*;

/**
 * 3. Задача на I/O:
 * - Пользователь вводит имя директории и имя файла с клавиатуры.
 * - Если путь или имя не корректны, предложить ввести заново.
 * - Если такой директории не существует, предложить создать.
 * - Если пользователь соглашается - создаем. Нет - пусть заново вводит имя директории.
 * - Учитывать, что может быть много уровней вложения директорий. Создавать весь путь.
 * - Если такой файл в этой директории уже есть, предложить заменить или создать новый с другим именем.
 * - В зависимости от выбора пользователя делаем действие.
 * - После того как все создано, считываем с клавиатуры 5 строк и записываем их в этот файл.
 * - После этого читаем эти строки из файла и выводим на экран в обратном порядке (сначала последнюю строку, потом предпоследнюю и тд.).
 * - При чтении из файла использовать try-with-resources.
 * - Предусмотреть все возможные исключения и перехватывать их, не дать программе упасть.
 */

class FileCreator {
    File createFile() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File makeDirectoryPath;
        do {
            System.out.println("Введите путь к папке, которую хотите создать, например: E:/Example/... /Example");
            String directoryPath = reader.readLine();
            makeDirectoryPath = new File((directoryPath));
            if (!makeDirectoryPath.exists()) {
                System.out.println("Папка: " + makeDirectoryPath.getAbsolutePath() +
                        " пути не существует. Создать её? Y/N");
                String answer = reader.readLine();
                if (answer.equals("Y") || answer.equals("y")) {
                    if (makeDirectoryPath.mkdirs()) {
                        System.out.println("Папка в: " + makeDirectoryPath.getAbsolutePath() +
                                " создана успешно.");
                    } else
                        System.out.println("Невозможно создать папку по указанному пути.");
                }
            } else
                System.out.println("Папка: " + makeDirectoryPath.getName() +
                        " по указанному пути: " + makeDirectoryPath.getAbsolutePath() + " уже существует.");
        } while (!makeDirectoryPath.exists());

        File makeFilePath;
        do {
            System.out.println("Введите имя файла, который вы хотите создать в указанной директории:");
            String fileName = reader.readLine();
            makeFilePath = new File(makeDirectoryPath, fileName);
            if (!makeFilePath.exists()) {
                System.out.println("Файл с указанным: " + fileName + " именем не существует! Создать его? Y/N");
                String answer = reader.readLine();
                if (answer.equals("Y") || answer.equals("y")) {
                    if (makeFilePath.createNewFile())
                        System.out.println("Файл с именем : " + makeFilePath.getName() +
                                " в директории по указанному пути: " + makeDirectoryPath.getAbsolutePath() +
                                " создан успешно.");
                }
                continue;
            } else
                System.out.println("Файл с именем: " + makeFilePath.getName() + " по указанному пути: " +
                        makeDirectoryPath.getAbsolutePath() + " уже существует. Перезаписать его? Y/N");
            String answer = reader.readLine();
            if (answer.equals("Y") || answer.equals("y")) {
                if (makeFilePath.delete()) {
                    if (makeFilePath.createNewFile())
                        System.out.println("Файл с именем : " + makeFilePath.getName() +
                                " в директории по указанному пути: " + makeDirectoryPath.getAbsolutePath() +
                                " перезаписан успешно!");
                }
            }
        } while (!makeFilePath.exists());
        return makeFilePath;
    }
}

