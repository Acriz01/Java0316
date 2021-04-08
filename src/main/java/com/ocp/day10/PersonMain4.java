/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class PersonMain4 {
    public static void main(String[] args) {
        Person[][] people = {
            {//A班
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5)
            },{//B班
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5)
            }
        };
        //請印出所有人的bmi資料
        Function<Person, Double> getBMI = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight()/100, 2);
            return Math.round(bmi * 100) / 100.0;
        };
        Stream.of(people)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBMI::apply)
                .forEach(System.out::println); // value -> System.out.println(value)
        //請問哪一個人BMI最大?
        double maxBmi=Stream.of(people)
                .flatMap(p->Stream.of(p))
                .mapToDouble(getBMI::apply)
                .summaryStatistics()
                .getMax();
        
        Consumer<Person> printPerson=p->{
            System.out.printf("%s %d %.1f %.1fKG bmi:%.2f\n",
                    p.getName(),p.getAge(),p.getHeight(),p.getWeight(),getBMI.apply(p));
        };
        Stream.of(people)
                .flatMap(p->Stream.of(p))
                .filter(p->getBMI.apply(p)==maxBmi)
                .forEach(printPerson);
        
    }
}
