
package com.lab.pig;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

    public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(Util.getPigs())
                .filter(r -> r.getAddr().contains("桃園"))
                .forEach(System.out::println);
       
        List pigcount = Stream.of(Util.getPigs())
                .filter(r -> r.getAddr().contains("桃園"))
                .collect(toList()); 
        System.out.printf("桃園筆數: %d\n", pigcount.size());
    }
}


