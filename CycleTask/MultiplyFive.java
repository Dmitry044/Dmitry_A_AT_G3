package CycleTask;

import java.util.Random;

public class MultiplyFive {
    // каждый элемент массива умножить на 5 и вывести результат в консоль

    static void method() {

            int[] myltiplyFive = new int[3];
            Random random = new Random();
            System.out.print("Исходный массив: ");
            for (int i = 0; i < myltiplyFive.length; i++) {
                System.out.print(myltiplyFive[i]) = random.nextInt(100);
            }

            System.out.print("Массив, умноженный на 5: ");
            for (int i = 0; i < myltiplyFive.length; i++) {
                System.out.print(myltiplyFive[i] * 5);
            }

        }
    }
