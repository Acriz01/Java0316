
package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //泛型<>:型別限定
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(90);
        scores.add(80);
        //scores.add(3.14);
        //scores.add(true);
        System.out.println(scores);
        Iterator<Integer> iter=scores.iterator();
        int sum=0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum+=next;
        }
        System.out.println(sum);
        //java8
        sum=scores.stream().mapToInt(score->score/*自動呼叫.intValue()*/).sum();
        sum=scores.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
