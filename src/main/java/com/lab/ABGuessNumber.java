/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;
//https://medium.com/@louroger_58763/java-%E7%AD%86%E8%A8%98-%E5%B9%BE-a-%E5%B9%BE-b-%E7%8C%9C%E6%95%B8%E5%AD%97%E9%81%8A%E6%88%B2-16c688d424df
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class ABGuessNumber {
    public static void main(String[] args) {
        int[] ansArray={5,8,4,1};
        do {            
            System.out.print("請輸入一組不重複的四位數:");
            Scanner sc=new Scanner(System.in);
            String guess=sc.next();
            int[] guessArray={guess.charAt(0)-48,guess.charAt(1)-48,guess.charAt(2)-48,guess.charAt(3)-48};
            //判斷a,b
            int a=0,b=0;
            for(int i=0;i<4;i++){
                if(ansArray[i]==guessArray[i]){
                    a++;
                }
            }
            for(int i=0;i<4;i++){
                for(int k=0;k<4;k++){
                    if(ansArray[i]==guessArray[k]){
                        b++;
                        break;
                    }
                }
            }
            b-=a;//b扣掉多算a的部分，也可以在前面迴圈中的if判斷式中加入&&i!=k
            System.out.printf("%d A %d B\n",a,b);
            if(a==4){
                System.out.println("Bingo");
                break;
            }
        } while (true);
    }
}
