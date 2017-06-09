package ITStep.homeworks.BigProject;

public abstract class Artist extends Human {

    String alias;

    public Artist(String name, int age, String alias) {
        super(name, age);
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
}
