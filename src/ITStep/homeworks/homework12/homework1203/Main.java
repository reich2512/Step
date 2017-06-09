package ITStep.homeworks.homework12.homework1203;

/**
 * Created by roman on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Entity entity1 = new Entity(1, "a");
        Entity entity2 = new Entity(1, "aa");

        System.out.println(entity1.compareTo(entity2));

        EntityComparator entityComparator = new EntityComparator();

        System.out.println(entityComparator.compare(entity1, entity2));

    }
}
