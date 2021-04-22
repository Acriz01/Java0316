
package com.ocp.day16;

public class AreaCalc2 {
    public static void main(String[] args) {
        //利用匿名類部類別實作
        CircleArea ca=new CircleArea() {
            @Override
            public double getArea(double r) {
                return Math.pow(r, 2)*Math.PI;
            }
        };
        //利用Lamda語法來實作
        CircleArea ca2=(double r)->Math.pow(r, 2)*Math.PI;//interface 方法名稱不重要因為就只有一個方法
        //(方法參考數列)->方法實作
        CircleArea ca3=(r)->Math.pow(r, 3)*Math.PI;
        
        System.out.println(ca2.getArea(15));
        System.out.println(ca3.getArea(15));
    }
}
