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
public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java cource");
        System.out.println("sb="+sb);
        //刪除全資料
        sb.delete(0, sb.length());// (0,11)從0開始到<11的全部資料
        //沒有deleteAll()這個api，考試會考size()混淆
        System.out.println("sb="+sb);
        
    }
}
