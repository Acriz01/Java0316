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
public class MultiArrayDemo4 {
        public static void main(String[] args) {
        //三人的身高體重如下，求BMI
        double[][] hw={{170,160,180},{60,45,90}};
        double bmi;
        for(int i=0;i<3;i++){
            bmi=hw[1][i]/Math.pow((hw[0][i]/100),2);
            System.out.printf("BMI%d=%.2f\n",i,bmi);
        }
        
    }
}