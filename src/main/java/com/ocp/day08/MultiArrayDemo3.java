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
public class MultiArrayDemo3 {
    public static void main(String[] args) {
        //三人的身高體重如下，求BMI
        double[][] hw={{170,60},{160,45},{180,90}};
        double bmi;
        for(int i=0;i<3;i++){
            bmi=hw[i][1]/Math.pow((hw[i][0]/100),2);
            System.out.printf("BMI%d=%.2f\n",i,bmi);
        }
        
        /*double[][] hw={{170,60},{160,45},{180,90}};
        for(double[] x:hw){
            double h=x[0];
            double w=x[1];
            double bmi=w/Math.pow(h/100,2 );
            System.out.printf("%.2f\n",bmi);
            */
        }
        
        
        
        
        
        
    }
}
