import java.util.Arrays;
import java.util.Random;

public class CreatEmptyArray {

    // создать пустой массив типа int и размера n = 7 и заполнить его случайными
    // элементами используя Random.nextInt(n)

    public static void main(String[] args) {
        CreatEmptyArray arrays = new CreatEmptyArray();
        arrays.foo();
    }

    void foo() {
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }

        System.out.println("Initial arrays: ");
        for (int i : array) {
            System.out.println(i + " ");
        }

        System.out.println();
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        System.out.println("Average value is: " + avg);

    }

}


