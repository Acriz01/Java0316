package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class School {

    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeople())
                //.peek(e->System.out.println(e.getClass().getTypeName()))
                .forEach(System.out::println);
        //請問考試的總分與平均=?
        IntSummaryStatistics stat = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student) x)//由Person轉型Studnet
                .mapToInt(x -> x.getScore())
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        //請問老師薪資總和與平均 
        IntSummaryStatistics stat2 = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher) x)
                .mapToInt(x -> x.getSalary())
                .summaryStatistics();
        System.out.println(stat2.getSum());
        System.out.println(stat2.getAverage());
        //印出不及格的學生姓名、分數、老師姓名以及不及格的總平均  
        Consumer<Student> p = x -> System.out.printf("學生:%s,分數:%d,老師:%s\n", x.getName(), x.getScore(), x.getTeacher().getName());
        Predicate<Student> notPass = x -> x.getScore() < 60;
        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student) x)
                .filter(notPass)
                .peek(p)
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("不及格平均:" + avg);
    }
}
