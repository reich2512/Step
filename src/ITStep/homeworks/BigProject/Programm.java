package ITStep.homeworks.BigProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programm {
    public static void main(String[] args) throws IOException {

        final int entityQuantity = 3;

        Human[] human = new Human[entityQuantity];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < human.length; i++) {
            System.out.println("Создание персонажа номер " + (i + 1) + ", задайте его имя:");
            String humanName = reader.readLine();
            System.out.println("Задайте его возраст:");
            int humanAge = Integer.parseInt(reader.readLine());
            human[i] = new Human(humanName, humanAge);
        }

        ArtAcademy artAcademy = new ArtAcademy();
        Artist[] artists = artAcademy.train(human);
        Concert concert = new Concert(artists);
        concert.introduceArtists();
        concert.runShow();
    }
}
