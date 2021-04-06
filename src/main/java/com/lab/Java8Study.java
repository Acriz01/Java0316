/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class Java8Study {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        //請印出所有成績
        //Java7:
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int s : scores) {
            System.out.println(s);
        }
        //Java8:(利用Stream.of()來進行資料分析)
        IntStream.of(scores).forEach(s -> System.out.println(s));//s代表一個stream(如同陣列)中的每一個元素
        IntStream.of(scores).forEach(System.out::println);
    }
}
