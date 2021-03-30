/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day07;

/**
 *
 * @author MB-study
 */
public class StringBuiderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("吃葡萄吐葡萄");
        System.out.println(sb);
        sb.append("皮");
        System.out.println(sb);
        sb.insert(3, "不");
        System.out.println(sb);
        sb.replace(1, 2, "葡");
        System.out.println(sb);
    }
}
