package tasks.day1;

import java.util.Random;

public class CreatEmptyArray {

    // создать пустой массив типа int и размера n = 7 и заполнить его случайными
    // элементами используя Random.nextInt(n)

    public int[] createNewEmptyArray() {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }
        return array;
    }

}


