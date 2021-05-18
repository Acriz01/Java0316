package com.ocp.day26;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);//("國文",100)->稱為Entry 含有(Key/Value)
        exams.put("數學", 100);
        exams.put("英文", 90);
        System.out.println(exams);
        //有很多Entry 稱為EntrySet
    }
}
