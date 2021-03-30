/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;

import java.util.*;

/**
 *
 * @author MB-study
 */
public class Util {
    //取得int[]答案陣列
    public static int [] getAnsArray() {
        Random r=new Random();
        int[] ans={0,0,0,0};//new int[4];
        for(int i=0;i<ans.length;){
            //隨機取一個n值(1-9)
            int n=r.nextInt(9)+1;
            boolean exist=isExist(ans, n);
            if(!exist){
                ans[i]=n;
                i++;//重要
            }
        }
        return ans;
    }
    //判斷n值是否在ans[] int陣列中
    private static boolean isExist(int [] ans,int n){
        for(int i=0;i<ans.length;i++){
            if(ans[i]==n){
                return true;
            }
        }
        return false;
    }
}
