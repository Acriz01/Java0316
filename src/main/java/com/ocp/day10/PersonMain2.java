/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day10;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class PersonMain2 {
    public static void main(String[] args) {
         Person[] people = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),
         };
         /*建立BMI的資料計算邏輯，使用Function<T,R>
         T代表傳入參數型別，在這邊指的就是Person物件 也就是p
         R代表回傳資料型別，在這邊指的就是Double也就是bmi的計算結果*/
         Function<Person,Double> getBMI=p->p.getWeight()/Math.pow(p.getHeight()/100,2);
         //正常bmi的過濾器Predicate<Person>
         //getBMI.apply(p)取得getBMI的計算結果
         Predicate<Person> normalBmi=p->getBMI.apply(p)>18&&getBMI.apply(p)<=23;
         //印出正常bmi的人名
         Stream.of(people).filter(normalBmi).forEach(p->System.out.println(p.getName()));
        
    }
    
}
