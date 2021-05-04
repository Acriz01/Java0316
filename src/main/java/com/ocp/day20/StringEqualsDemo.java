
package com.ocp.day20;

public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1="Java";
        String s2=new String("Java");
        String s3=new String(new char[]{'j','a','v','a'});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
   
}
