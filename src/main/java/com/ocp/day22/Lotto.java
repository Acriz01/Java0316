package com.ocp.day22;

import java.util.Arrays;
import java.util.Random;
//private建構子singleton單一實體<->Multiton多例(就是平常可以new很多個的)
public class Lotto {
    private String value;
    private static Lotto lottoInstance=new Lotto();//樂透本身自己建自己(因為別人不能new)
    public static Lotto getLotto(){
        return lottoInstance;
    }
    private Lotto() {
        Random r = new Random();
        int[] values = {
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1
        };
        value = Arrays.toString(values);
    }

    public String getValue() {
        return value;
    }
}
/*
考題:
You want to create a singleton class by using the Singleton design pattern.
Which two statements enforce the singleton nature of the design?

A. Make the class static.
B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
D. Use a static reference to point to the single instance.
E. Implement the Serializable interface.

Ans:BD
*/