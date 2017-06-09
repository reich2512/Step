package ITStep.homeworks.homework12.homework1205;

import java.util.LinkedList;

/**
 * Created by roman on 21.11.2016.
 */
public class MyAnyTypeStack<E> {

    int capasity;

    LinkedList<E> linkedList = new LinkedList<>();

    public MyAnyTypeStack(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "linkedList = " + linkedList;
    }

    public boolean add(E value) {
        if (linkedList.size() < capasity) {
            linkedList.offerLast(value);
            return true;
        } else return false;
    }

    public E remove() {
        if (linkedList.isEmpty()) {
            return null;
        } else return linkedList.pollLast();
    }

    public int size() {
        return linkedList.size();
    }

}
