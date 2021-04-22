package com.ocp.day16;

public class BMICalc {

    public static void main(String[] args) {
        //利用Lamda實作BMI介面
        //h=170,w=60求BMI
        BMI bmi = (h, w) -> w / Math.pow(h / 100, 2);
        System.out.println(bmi.getResult(170, 60));
    }
}
