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
public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1="Jbvb";
        String s2="Java";
        s1=s2.replace('b', 'a');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
    }
}
