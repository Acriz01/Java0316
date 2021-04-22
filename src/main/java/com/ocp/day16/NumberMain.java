
package com.ocp.day16;

public class NumberMain {
    public static void main(String[] args) {
        //Lamda實作EvenNumber =50是否是偶數
        EvenNumber even=(n)->n%2==0;
        System.out.println(even.isEven(50));
        //Lamda實作PrimeNumber =9973是否是質數
        PrimeNumber prime=(n)->{
            for(int i=1;i<=n;i++){
                
            }

        };
       
    }
}
