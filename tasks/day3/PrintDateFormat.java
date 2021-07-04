package tasks.day3;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class PrintDateFormat {

    //2.5 написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
    //и выводит в консоль в формате "September, 7, 2020 22:00"


            DateTimeFormatter("22.00 07.09.2020").getParser();
    DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(null).toFormatter();

    DateTimeFormatter datenew = formatter.parse("September, 7, 2020 22:00");


} determineDateFormat()
