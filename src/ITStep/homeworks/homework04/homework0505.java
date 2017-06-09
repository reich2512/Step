package ITStep.homeworks.homework04;

/**
 * Created by roman on 15.09.2016.
 * У Деда Мороза есть часы, которые в секундах показывают сколько осталось до каждого
 Нового Года. Так как Дед Мороз уже человек в возрасте, то некоторые математические
 операции он быстро выполнять не в состоянии. Помогите Деду Морозу определить
 сколько полных дней, часов, минут и секунд осталось до следующего Нового Года, если
 известно сколько осталось секунд, т.е. разложите время в секундах на полное
 количество дней, часов, минут и секунд.
 */
public class homework0505 {
    public static void main(String[] args) {

        int secsToNewYear = 86400;
        int days = secsToNewYear / 86400;
        int hours = (secsToNewYear - (days * 86400)) / 3600;
        int mins = (secsToNewYear - (((days * 24) + hours) * 3600)) / 60;
        int secs = (secsToNewYear - (days * 86400 + hours * 3600 + mins * 60));


        System.out.println("До Нового Года осталось " + days + " дней, " + hours + " часов, " + mins + " минут, " + secs + " секунд.");
    }
}
