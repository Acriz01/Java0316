/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class Java8Study6 {

    public static void main(String[] args) {
        String[] names = {"banana", "watermalon", "apple", "orange", "mango"};
        //求所有字母總和個數
        int sum = 0;
        for (String n : names) {
            sum += n.length();
        }
        System.out.println(sum);
        //求字母為偶數個的字串，字母總和個數
        int sum2=Stream.of(names)
                .mapToInt(String::length)//.mapToInt(s->s.length())
                .filter(s->s%2==0)
                .sum();
        System.out.println(sum2);
    }
}
