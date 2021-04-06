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
public class Java8Study3 {
    public static void main(String[] args) {
         int[] scores = {80, 50, 70, 90, 40};
         //算出總平均
         //Java7:
         int sum1=0;
         for(int s:scores){
             sum1+=s;
         }
         double avg1=(double)sum1/scores.length;
         System.out.println(sum1);
         System.out.println(avg1);
         //Java8:
         int sum2=IntStream.of(scores).sum();
         double avg2=IntStream.of(scores).average().getAsDouble();//average()出來是物件需要getAsDouble()指取average()中的double值
         double avg3=(double)sum2/scores.length;
         System.out.println(sum2);
         System.out.println(avg2);
    }
}
