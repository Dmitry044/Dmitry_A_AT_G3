package CycleTask;

import java.util.Random;

public class CreatEmptyArray {

    // создать пустой массив типа int и размера n = 7 и заполнить его случайными
    // элементами используя Random.nextInt(n)

    public void metCreateNewEmptyArray (String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        for (int i : array) {
            array[i] = random.nextInt(7);
        }
    }

}


