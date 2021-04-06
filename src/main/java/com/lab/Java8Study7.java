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
public class Java8Study7 {
    public static void main(String[] args) {
        String[][] names={{"Jo","Mary"},{"John","Helen"},{"Bob"}};
        //求所有字母總和
       int sum=Stream.of(names)
               .flatMap(s ->Stream.of(s))//字串陣列String[]轉串流Stream
               .mapToInt(String::length)
               .sum();
        System.out.println(sum);
    }
}
