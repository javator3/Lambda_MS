package pl.sda.lambda;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //wyrazenie bez nazwy ?

        AddInterface add = (a, b) -> a + b;
        add.calc(4,2);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        for(Integer integer: numbers){
            System.out.println(integer);
        }

        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println);


        List<Movie> movies = Arrays.asList(
                new Movie("Przeminęło z wiatrem","Jan", LocalDate.of(2012,02,12),
                        44.45,
                        Arrays.asList("Michal","Maciek")),
                new Movie("Wejście smoka","Roman", LocalDate.of(2032,02,12),
                        654.45,
                        Arrays.asList("Michaił","Marzena")));

        List<String> titles = movies
                .stream()
                .map(f ->f.getTitle())
                .collect(Collectors.toList());

        System.out.println(titles);
        System.out.println(movies.stream().map(f ->f.getTitle()).collect(Collectors.toList()));

        //****************

        List<String> directors = movies
                .stream()
                .map(f ->f.getDirector())
                .collect(Collectors.toList());

        System.out.println(directors);
        System.out.println(movies.stream().map(f ->f.getDirector()).collect(Collectors.toList()));



        //uchwyt tworzymy za pomoca interfejsu funkcyjnego ?
        //
        //
        }
}
