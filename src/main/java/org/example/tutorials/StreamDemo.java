package org.example.tutorials;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>(5);
        arrays.add(10);
        arrays.add(20);
        arrays.add(30);
        arrays.add(40);

        List<String> languages = new ArrayList<>(5);

        languages.add("java");
        languages.add("python");
        languages.add("scala");
        languages.add("perl");
        languages.add("lisp");



        List<Integer> squareList = new ArrayList<>(5);
//      squaresList.addAll(arrays); to add a full array to another
        for (Integer i: arrays) {
            squareList.add(i*i);
        }
        System.out.println("List of squared numbers: "+ squareList);
        // OR
        List<Integer> squareList0 =  arrays.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("List of squared numbers: "+ squareList0);
        /*
        Similarly
         */
        List<Integer> squareList1 =  arrays.stream().map(x -> x*x).toList();
        System.out.println("List of squared numbers: "+ squareList1);

        Set<Integer> squareSet = new HashSet<>(5);

        for (Integer i: arrays) {
            squareSet.add(i*i);
        }

        Set<Integer> squaresSet = arrays.stream().map(x -> x*x).collect(Collectors.toSet());

        System.out.println("Set of streamed numbers: "+ squareSet);
        System.out.println("Set of streamed numbers: "+ squaresSet);

        List<String> filterList = new ArrayList<>(5);
        for (String s:
             languages) {
            if (s.startsWith("p")) {
                filterList.add(s);
            }
        }
        System.out.println(filterList);

        List<String> filtersList = languages.stream().filter(x->x.contains("p")).collect(Collectors.toList());
        System.out.println(filtersList);

        languages.forEach(System.out::println);
        /*
        OR
         */
//        languages.stream().forEach(x -> System.out.println(x));
        int sum = arrays.stream().reduce(0,(ans, i)-> ans+i);
        /*
        OR
         */
        int sum1 = arrays.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum1);
    }
}

