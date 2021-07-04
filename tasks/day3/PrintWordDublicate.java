package tasks.day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintWordDublicate {

    //1. String task (коллекции и потоки не использовать!)
    //2.1 найти и вывести в консоль все дубликаты слов в строке текста


    //public static void main(String[] args) {
        String value = "This is testing JAVA_AT testing course";
        String item [] = value.split(" ");
        Map<String,Integer> unique = new HashMap<String,Integer>();

        for(String a: item){
            if(unique.containsKey(a))
            {
                unique.put(a,1);
            }
            else
            {
                unique.put(a,unique.get(a)+1);
            }
        }
        Set<String>keys = unique.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(unique.get(key));
        }
    }
}


