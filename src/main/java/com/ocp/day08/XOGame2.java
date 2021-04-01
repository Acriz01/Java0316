/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

import java.util.*;

/**
 *
 * @author MB-study
 */
public class XOGame2 {
    public static void main(String[] args) {
        char[][] xo=new char[3][3];
       do{
           Scanner sc=new Scanner(System.in); 
           print(xo);
           //user
           System.out.println("請選擇(0~8)==>");
           int n=sc.nextInt();
           if(xo[n/3][n%3]=='\u0000'){
               xo[n/3][n%3]='O';
           };
           //PC
           while (true) {               
            int m=new Random().nextInt(9);//0-8
            if(xo[m/3][m%3]=='\u0000'){
            xo[m/3][m%3]='X';
            break;
            }
           }
          
       }while(true);
    }
    public static void print(char [][] xo) {
        for(char[] x:xo){
            System.out.print(" | ");
            for(char y:x){
                System.out.print(y+" | ");
            }
            System.out.println();
        }
        
    }
}
