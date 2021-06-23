package CycleTask;

// пройти по массиву и вывести в консоль все элементы

import java.util.Random;

public class ShowArrayElements {

    public void metPrintAllElementsFromArray() {
        int[] initial = new int[7];
        Random random = new Random();
        for (int i = 0; i < initial.length; i++) {
            initial[i] = random.nextInt(20);
        }
        for (int i = 0; i < initial.length; i++) {
            System.out.print(initial [1]);
        }

    }


}
