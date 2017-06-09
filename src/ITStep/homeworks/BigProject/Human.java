package ITStep.homeworks.BigProject;

import ITStep.homeworks.BigProject.Skills.Skills;

public class Human implements Skills {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sing() {
        System.out.println("поёт");
    }

    @Override
    public void dance() {
        System.out.println("танцует");
    }

    @Override
    public void playMusic() {
        System.out.println("играет музыку");
    }
}
