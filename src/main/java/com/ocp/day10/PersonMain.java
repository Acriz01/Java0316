/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class PersonMain {

    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 180, 75.5),
            new Person("Tom", 21, 190, 120.5),};
        //請印出未成年的人名?
        Stream.of(people)
                .filter(p -> p.getAge() < 10)
                .forEach(p -> System.out.println(p.getName()));
        //請印出BMI合格(正常)的人名(18<BMI<=23) part 1
        Stream.of(people)
                .filter(p -> {
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi <= 23) {
                        return true;
                    }
                    return false;
                })
                .forEach(p -> System.out.println(p.getName()));
        //part 2
        //將BMI合格正常的過濾邏輯(filter)先拆出來
        Predicate<Person> normalBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 18 && bmi <= 23) {
                return true;
            }
            return false;
        };
        Predicate<Person> ThinBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi < 18) {
                return true;
            }
            return false;
        };
        Predicate<Person> FatBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 23) {
                return true;
            }
            return false;
        };
        Stream.of(people)
                .filter(normalBmi)
                .forEach(p->System.out.println(p.getName()));

    }
}
