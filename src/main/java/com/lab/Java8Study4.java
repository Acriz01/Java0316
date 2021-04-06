/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class Java8Study4 {
    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        //sum,avg,max,min
        int sum=IntStream.of(scores).sum();
        double avg=IntStream.of(scores).average().getAsDouble();
        int max=IntStream.of(scores).max().getAsInt();
        int min=IntStream.of(scores).min().getAsInt();
        System.out.printf("sum:%d,avg:%.1f,max:%d,min:%d\n",
                sum,avg,max,min);
        
        //Java8 Part II(統計api)
        IntSummaryStatistics stat=IntStream.of(scores).summaryStatistics();
        System.out.printf("sum:%d,avg:%.1f,max:%d,min:%d\n",
                sum,avg,max,min);
        
    }
}
