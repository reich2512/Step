package ITStep.homeworks.homework13.homework1302;

/**
 * 2. Задача на generic'и:
 * - Дописать типизированную очередь, которую я начал делать на уроке.
 * - У очереди должно быть 3 метода: add (Добавляет элемент в конец), get (забирает элемент с начала), size (возвращает текущий размер).
 * - Если очередь пустая, get возвращает null.
 * - Очередь должна работать для любого типа, ничего готового не ипользовать, все пишем свое.
 */

public class MyTypedQueue<T> {

    private Node head;
    private Node tail;
    private int size;

    private static class Node<T> {
        private T value;
        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

    public void add(T value) {
        Node node = new Node(value, null);
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public T get() {
        T value = null;
        if (size > 0) {
            value = (T) head.getValue();
            head = head.next;
            size--;
        }
        return value;
    }

    public int size() {
        return size;
    }
}
