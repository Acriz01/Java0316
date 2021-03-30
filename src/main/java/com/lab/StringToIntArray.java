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
public class StringToIntArray {
    public static void main(String[] args) {
        String s="1234";
        int[] nums={s.charAt(0)-48,s.charAt(1)-48,s.charAt(2)-48,s.charAt(3)-48};//字串轉int陣列會印出ASCII code，減掉'0'=48
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }
}
