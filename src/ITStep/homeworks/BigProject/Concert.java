package ITStep.homeworks.BigProject;

public class Concert {

    Artist[] artists;

    public Concert(Artist[] artists) {
        this.artists = artists;
    }

    public void introduceArtists() {
        System.out.println("Представляем артистов!");
        for (int i = 0; i < artists.length; i++) {
            String[] arrayStringToAge = {"лет", "год", "года", "года", "года", "лет", "лет", "лет", "лет", "лет"};
            String stringAge = arrayStringToAge[artists[i].getAge() % 10];
            System.out.println("Привет! Меня зовут " + artists[i].getName() +
                    ", мне " + artists[i].getAge() + " " + stringAge +
                    ", я выступаю под псевдонимом - " + artists[i].getAlias() + ", я - " + artists[i].getClass().getSimpleName());
        }
    }

    public void runShow() {
        System.out.println("Начинаем наше шоу!");
        for (int i = 0; i < artists.length; i++) {
            String artistPlan = artists[i].getClass().getSimpleName();

            switch (artistPlan) {
                case "BrakeDancer":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].dance();
                    break;
                case "HipHopDancer":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].dance();
                    break;
                case "OperaSinger":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].sing();
                    break;
                case "PopSinger":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].sing();
                    break;
                case "PopMusician":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].playMusic();
                    break;
                case "RockMusician":
                    System.out.print(artists[i].getAlias() + " ");
                    artists[i].playMusic();
                    break;
            }
        }
    }
}