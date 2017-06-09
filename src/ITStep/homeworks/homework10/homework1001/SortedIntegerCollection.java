package ITStep.homeworks.homework10.homework1001;

/**
 * Created by roman on 28.11.2016.
 * - Сделать еще один вид коллекции - сортированная коллекция. Она будет наследником обычной.
 * После каждой операции с коллекцией она должна быть в отсортированном виде.
 */

public class SortedIntegerCollection extends IntegerCollection {

    @Override
    public void add(Integer value) {

        if (size == array.length) {
            increaseCapacity();
        }

        if (size == 0) {
            array[0] = value;
        } else {
            for (int i = 0; i < size; i++) {
                if (value == array[i]) {
                    System.arraycopy(array, i, array, i + 1, size - i);
                } else if (value < array[i]) {

                    System.arraycopy(array, i, array, i + 1, size - i);
                    array[i] = value;
                    break;
                } else if (value > array[i] && array[i + 1] == 0) {
                    array[i + 1] = value;
                }
            }
        }
        size++;
    }

    @Override
    public boolean remove(Integer value) {
        return super.remove(value);
    }

    public int size() {
        return size;
    }
}
