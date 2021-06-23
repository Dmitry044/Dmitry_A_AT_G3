package CycleTask;

import java.util.Random;

public class ChangeOrder {

    //поменять местами первый и последний элементы и вывести результат в консоль

    static void method9() {
        int[] changeOrder = new int[3];
        Random random = new Random();
        System.out.print("Исходный массив: ");
        for (int i = 0; i < changeOrder.length; i++) {
            System.out.print(changeOrder[i] = random.nextInt(15));
        }

        int firstElement = changeOrder[0];
        changeOrder[0] = changeOrder[changeOrder.length 1];
        changeOrder[changeOrder] = firstElement;

        System.out.print("Первый элемент: " + changeOrder[0]);
        System.out.print("Последний элемент: " + firstElement);
    }
}
