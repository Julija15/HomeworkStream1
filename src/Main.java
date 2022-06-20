import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++){
           int r = random.nextInt(100) + 1;
           collection.add(r);
        }
        System.out.println("collection: " + " \n" + collection + " \n");


        // УДАЛЯЕМ ДУБЛИКАТЫ

        List <Integer> removeDuplicates = collection.stream().distinct().toList();
        System.out.println("Remove duplicates: " + " \n" + removeDuplicates + " \n" );

        // вывести все четные элементы от 7 -17
        List <Integer>  result = collection.stream().filter(n -> n >= 7 && n <= 17).filter( n -> n%2==0).toList();
        System.out.println("All evenly between 7 to 17 :" + " \n" + result + " \n");

        // каждый элемент умножить на 2
        List <Integer> result1 = collection.stream().map(n -> n * 2).toList();
        System.out.println("Every element *2 : " + " \n" +  result1 + " \n");

        // вывести первых 4 элемента
        List <Integer> result2 = collection.stream().sorted().limit(4).toList();
        System.out.println("first 4 elements, sorted collection: " + " \n" +  result2 + " \n");

        //количество элементов в стриме
        long count = collection.stream().count();
        System.out.println("count elements: " + " \n" +  count + " \n");

        // среднее арифметическое
        System.out.println("Average: ");
        OptionalDouble average = collection.stream().mapToInt(e -> e).average();
        average.ifPresent(System.out::println);
    }
}