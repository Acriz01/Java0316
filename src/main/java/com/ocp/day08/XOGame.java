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
public class XOGame {
    public static void main(String[] args) {
        char[][] xo={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        print(xo);
        System.out.println("輸入 xo[1][0]='O'");
        xo[1][0]='O';
        print(xo);
    }
    public static void print(char [][] xo) {
        for(char[] x:xo){
            System.out.print("|");
            for(char y:x){
                System.out.print(y+"|");
            }
            System.out.println();
        }
        
    }
}
