package CycleTask;

import java.util.Random;

public class SearchMinElement {

    //найти минимальный элемент массива и вывести результат в консоль

    public class Array5 {

        static void searchminelement() {
            int[] searchminelement = new int[3];
            Random random = new Random();
            System.out.print("Исходный массив: ");
            for (int i = 0; i < searchminelement;
                 i++) {
                System.out.print(searchminelement[i] = random.nextInt(15));
            }
            int minValue = searchminelement[0];

            for (int i = 0; i < searchminelement.length;
                 i++) {
                if (searchminelement[i] < minValue) {
                    minValue = searchminelement[i];
                }
                System.out.print("Минимальное значение: " = minValue);
            }

        }
    }


}


