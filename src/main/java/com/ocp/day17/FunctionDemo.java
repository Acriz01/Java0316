
package com.ocp.day17;

import java.util.function.Function;

public class FunctionDemo {
    //利用Function來實作圓面積
    //半徑r是整數，面積area是浮點數
    Function<Integer,Double> f1=(Integer r)->Math.pow(r,2)*Math.PI;
    System.out.println(f1.apply(10));
    //利用Function來實作球體體積
    //半徑r是整數，面積area是浮點數
    Function<Integer,Double> f2=(Integer r)->4.0/3.0*Math.pow(r, 3);
    System.out.println(f2.apply(10));
    //利用BiFunction來求矩形面積
    //半徑r是整數，面積area是浮點數
}
