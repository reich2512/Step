package ITStep.homeworks.BigProject;

import ITStep.homeworks.BigProject.ArtistsPlans.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArtAcademy {

    Artist[] train(Human[] human) throws IOException {

        Artist[] artist = new Artist[human.length];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < human.length; i++) {
            System.out.println("Человек " + (i + 1) + " начинает обучение на артиста, введите его псевдоним:");
            String alias = reader.readLine();
            Random random = new Random();
            int artistsPlans = (random.nextInt(6) + 1);
            switch (artistsPlans) {
                case 1:
                    artist[i] = new BrakeDancer(human[i].getName(), human[i].getAge(), alias);
                    break;
                case 2:
                    artist[i] = new HipHopDancer(human[i].getName(), human[i].getAge(), alias);
                    break;
                case 3:
                    artist[i] = new OperaSinger(human[i].getName(), human[i].getAge(), alias);
                    break;
                case 4:
                    artist[i] = new PopSinger(human[i].getName(), human[i].getAge(), alias);
                    break;
                case 5:
                    artist[i] = new RockMusician(human[i].getName(), human[i].getAge(), alias);
                    break;
                case 6:
                    artist[i] = new PopMusician(human[i].getName(), human[i].getAge(), alias);
                    break;
            }
        }
        return artist;
    }

    public ArtAcademy() {
    }
}
