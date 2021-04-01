/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo2 {
    public static void main(String[] args) {
        //int[][] m=new int[][]{{100,90,80},{70,60,50}};
        int[][] m={{100,90,80},{70,60,50}};
        /*
        int[][] s={{},{}};
        System.out.println(m.length);
        int[][] s={{100,90},{}};
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.println(m[i][j]);
            }
        }
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                System.out.println(s[i][j]);
            }
        }*/
        System.out.println(m);//兩個[代表印出一個二維陣列，I表int，@是hash code，印出位置
        System.out.println(m[0]);
        System.out.println(m[1]);
       //求總分
       int sum=0;
        for(int[] x:m){//x is m[0] or m[1]。分析m，裡面都是一維陣列x
            for(int y:x){//分析x，裡面都是int y
                sum+=y;
            }
        }
        System.out.println(sum);
    }
    
}
