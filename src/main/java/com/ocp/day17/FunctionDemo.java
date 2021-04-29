
package com.ocp.day17;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) { 
    //利用Function來實作圓面積
    //半徑r是整數，面積area是浮點數
    Function<Integer,Double> f1=(Integer r)->Math.pow(r,2)*Math.PI;
    System.out.println(f1.apply(10));
    //利用Function來實作球體體積
    //半徑r是整數，面積area是浮點數
    Function<Integer,Double> f2=(Integer r)->4.0/3.0*Math.pow(r, 3);
    System.out.println(f2.apply(10));
    //利用BiFunction來求矩形面積
    BiFunction<Integer,Integer,Integer> f3=(h,w)->h*w;
    System.out.println(f3.apply(10,20));
    //利用BiFunction來求矩形面積
    BinaryOperator<Integer> f4=(h,w)->h*w;//=BiFunction<T,T,T>，https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html
    System.out.println(f4.apply(10,20));
    }
}
