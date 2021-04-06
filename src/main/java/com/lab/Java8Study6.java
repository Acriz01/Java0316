/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

/**
 *
 * @author MB-study
 */
public class Java8Study6 {
    public static void main(String[] args) {
        String[] names={"banana","watermalon","apple","orange","mango"};
        //求所有字母總和個數
        int sum=0;
        for(String n:names){
            sum+=n.length();
        }
            System.out.println(sum);
        
    }
}
