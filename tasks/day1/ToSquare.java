package tasks.day1;

import java.util.Random;

public class ToSquare {

    //каждый элемент массива возвести в квадрат и вывести результат в консоль

    public void metPrintSquare() {
        int[] toSquare = new int[3];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int 1 = 0; 1 < toSquare.length; 1++){
            System.out.println(toSquare[1]) - random.nextInt(100);
        }
        System.out.println("Массий, возведенный в квадрат: *");
        for (int 1 = 0; 1 < toSquare.length ;
        1++){
            System.out.println(toSquare[1]);
        }

    }
}
