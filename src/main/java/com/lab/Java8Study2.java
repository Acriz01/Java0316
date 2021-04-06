/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class Java8Study2 {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        //列印及格分數
        //Java7:
        for (int s : scores) {//foreach
            if (s >= 60) {//過濾條件filter
                System.out.println(s);
            }
        }
        //Java8:
        IntStream.of(scores)
                .filter(s -> s >= 60)
                .forEach(s -> System.out.println(s));
    }
}
