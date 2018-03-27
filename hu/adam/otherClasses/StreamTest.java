package hu.adam.otherClasses;


import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> pows = new ArrayList<>();
        List<Integer> modByThrees = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);

        }
        for (Integer number :
                numbers) {
            pows.add(number * number);
        }

        for(Integer number : pows){
            if(number % 3 == 0){
                modByThrees.add(number);
            }
        }
        System.out.println(modByThrees);



        System.out.println(IntStream.rangeClosed(1,10)
                .map(i -> i*i)
                .filter(i -> i % 3 ==0)
                .boxed()
                .collect(Collectors.toList()));

        List<Integer> collect = numbers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);



        System.out.println(collect.stream()
                .filter((Predicate) o -> (Integer) o == 6)


                .count());


        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"));

    }

}
