package ITStep.homeworks.homework06;

import java.util.Arrays;

/**
 * Created by roman on 06.10.2016.
 * 1. Написать метод, который принимает индекс элемента в последовательности Фибоначчи,
 * а возвращает само число, которое находится по этому индексу.
 * 2. Тоже задание, только решить с помощью рекурсии.
 * 3. Написать метод, который принимает количество элементов (N) в массиве и возвращает
 * массив первых N чисел последовательности фибоначчи.
 */
public class Homework06 {

    static int calculationFibonacciNumberWithCycle(int index) {

        int firstNumberFibonacciSequence = 1;
        int secondNumberFibonacciSequence = 1;
        int numberFibonacci = 0;

        for (int i = 2; i < index; i++) {
            numberFibonacci = firstNumberFibonacciSequence + secondNumberFibonacciSequence;
            firstNumberFibonacciSequence = secondNumberFibonacciSequence;
            secondNumberFibonacciSequence = numberFibonacci;
        }

        if (index <= 0) {
            return 0;
        } else {
            if (index == 1 || index == 2) {
                return 1;
            } else {
                return numberFibonacci;
            }
        }
    }

    static int calculationFibonacciNumberWithRecursion(int index) {

        if (index <= 0) {
            return 0;
        } else {
            if (index == 1 || index == 2) {
                return 1;
            } else {
                return calculationFibonacciNumberWithRecursion(index - 1) + calculationFibonacciNumberWithRecursion(index - 2);
            }
        }
    }

    static int [] returnArrayFibonacciNumbers(int quantity){

        int [] fibonacciNumbers = new int[quantity];

        for (int i = 0; i <= quantity - 1; i++) {
            fibonacciNumbers[i] = calculationFibonacciNumberWithRecursion(i + 1);
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args) {

        int index = 9;
        System.out.println(calculationFibonacciNumberWithCycle(index));
        System.out.println(calculationFibonacciNumberWithRecursion(index));
        System.out.println(Arrays.toString(returnArrayFibonacciNumbers(index)));
    }
}
