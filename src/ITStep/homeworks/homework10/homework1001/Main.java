package ITStep.homeworks.homework10.homework1001;



/**
 * Created by roman on 07.11.2016.
 * 1. Коллекция
 *  - Сделать метод удаляющий елемент коллекции. Принимает сам элемент, возвращает boolean (удалил или нет, если не было такого внутри)).
 * - Сделать еще один итератор, который будет перебирать в обратном порядке.
 * - Оба итератора должны имплементить интерфейс итератор, назвать реализации по желанию.
 * - Сделать еще один вид коллекции - сортированная коллекция. Она будет наследником обычной. После каждой операции с коллекцией она должна быть в отсортированном виде.
 */

public class Main {
    public static void main(String[] args) {

//        IntegerCollection collection = new IntegerCollection(15);
//
//        for (int i = 0; i < 20; i++) {
//            collection.add(i);
//        }
//
//        System.out.println(collection);
//
//        collection.add(10);
//
//        System.out.println(collection);
//
//        IntegerCollection.Iterator iterator = collection.getIterator();
//
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        System.out.println();
//
//        System.out.println(collection.remove(5));
//
//        System.out.println(collection);
//
//        IntegerCollection.BackwardIterator backwargIterator = collection.getBackwardIterator();
//
//        while (backwargIterator.hasNext()){
//            System.out.print(backwargIterator.next() + " ");
//        }
//
//        System.out.println();//

        SortedIntegerCollection sortedIntegerCollection = new SortedIntegerCollection();

        sortedIntegerCollection.add(5);
        sortedIntegerCollection.add(3);
        sortedIntegerCollection.add(1);
        sortedIntegerCollection.remove(3);

        System.out.println(sortedIntegerCollection.size());

        System.out.println(sortedIntegerCollection);
    }
}
