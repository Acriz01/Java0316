
package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
         Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(-150);
        System.out.println(scores);
        //請用java8計算國英數的總數
        int sum=0;
        sum=scores.stream().mapToInt(Integer::intValue).filter(score->score=<100&&score>=0).sum();
        
    }
}
