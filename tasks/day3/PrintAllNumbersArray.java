package tasks.day3;

public class PrintAllNumbersArray {

    //2.2 найти в тексте все цифры и преобразовать их в массив числовых переменных,
    // вывести все элементы массива в косоль

    //public static void main(String args[]) {

        int x = 123456789;
        String NumbersAndWords = "26263Hello";

        char[] array = NumbersAndWords.toCharArray();

        int x[] = new int[array.length];
        int intarray[] = new int[array.length];
        for (
                int i = 0;
                i < array.length; i++) {
            intarray[i] = Integer.parseInt(array[i]);
        }
    }

