package ITStep.homeworks.homework09.homework0901;

/**
 * Created by roman on 26.10.2016.
 * Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения.
 */
public class Student extends Man {

    private int educationYear;

    public int getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }
}
