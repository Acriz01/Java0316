/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class Java8Study5 {
    public static void main(String[] args) {
        String[] scores = {"80", "50", "70", "90", "40"};
        //算及格成績sum
        int[] scores2={0,0,0,0,0};
        /*錯誤for(String s:scores){
            for(int s2:scores2){
                s2=Integer.valueOf(s);
            }
        }錯誤*/
        for (int i = 0; i < 5; i++) {
            scores2[i] = Integer.valueOf(scores[i]);
        }
        int sum=0;
        for(int s2:scores2){
            if(s2>=60){
                sum+=s2;
            }
        }
        System.out.println(sum);
        
        //Java8
        sum=0;
        IntSummaryStatistics stat=Stream.of(scores)
                .mapToInt(s -> Integer.parseInt(s))//得到IntStream
                .filter(s->s>=60)//過濾及格分數
                .summaryStatistics();//統計物件
        System.out.printf("sum:%d,max:%d,min:%d\n",
                stat.getSum(),stat.getMax(),stat.getMin());
        
        
       
        
    }
}
