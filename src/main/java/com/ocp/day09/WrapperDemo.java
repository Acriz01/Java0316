/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day09;

/**
 *
 * @author MB-study
 */
public class WrapperDemo {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.printf("int 的最大值:%d\n",max);
        int max2=Integer.max(10, 20);
        System.out.printf("10與20的最大值是:%d\n",max2);
        String chinese="20";
        String english="0";
        System.out.printf("總分:%s\n",chinese+english);
        System.out.printf("總分:%s\n",Integer.parseInt(chinese)+Integer.parseInt(english));
        
    }
}
