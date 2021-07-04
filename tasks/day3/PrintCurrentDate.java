package tasks.day3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintCurrentDate {

    //2.4 написать метод, который выводит в консоль текущую дату и время в формате:
    //Сейчас на дворе:
    //19 сентября, 2020, 3 часа 13 минут

    //public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd B, Y, k 'часа' m 'минут'");
        System.out.println("Сейчас на дворе:" + formatForDateNow.format(date));
    }
}
