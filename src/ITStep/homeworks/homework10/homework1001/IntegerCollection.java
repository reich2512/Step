package ITStep.homeworks.homework10.homework1001;

import java.util.Arrays;

/**
 * Created by roman on 07.11.2016.
 * - Сделать метод удаляющий елемент коллекции. Принимает сам элемент, возвращает boolean (удалил или нет, если не было такого внутри)).
 * - Сделать еще один итератор, который будет перебирать в обратном порядке.
 * - Оба итератора должны имплементить интерфейс итератор, назвать реализации по желанию.
 * - Сделать еще один вид коллекции - сортированная коллекция. Она будет наследником обычной.
 * После каждой операции с коллекцией она должна быть в отсортированном виде.
 */

public class IntegerCollection {

    static int defaultCapacity = 15;

    int size = 0;

    Integer[] array;

    public IntegerCollection() {
        array = new Integer[defaultCapacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public IntegerCollection(int capacity) {
        array = new Integer[capacity];
    }

    public void add(Integer value) {
        array[size++] = value;
        if (size == array.length) {
            increaseCapacity();
        }
    }

    public boolean remove(Integer value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                return true;
            }
        }
        return false;
    }

    void increaseCapacity() {
        Integer[] temp = array;
        array = new Integer[temp.length * 3 / 2];
        System.arraycopy(temp, 0, array, 0, temp.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }


    class Iterator implements java.util.Iterator {

        private int index = 0;

        public boolean hasNext() {
            return index < array.length;
        }

        public Integer next() {
            return array[index++];
        }
    }

    public Iterator getIterator() {
        return new Iterator();
    }

    public BackwardIterator getBackwardIterator() {
        return new BackwardIterator();
    }

    class BackwardIterator implements java.util.Iterator {

        private int index = array.length - 1;

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public Object next() {
            return array[index--];
        }
    }
}
