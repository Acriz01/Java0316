
package com.ocp.day23;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo5 {
    public static void main(String[] args) {
        //排序性 小->大
        Set<Integer> nums=new TreeSet<>();
        //1-9任意5個
        Random r=new Random();
        for(int i=0;i<7;i++){
            int n=r.nextInt(9)+1;
            System.out.println("n:"+n);
            nums.add(n);
        }
        System.out.println(nums);
    }
}
