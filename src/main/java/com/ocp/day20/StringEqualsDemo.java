
package com.ocp.day20;

public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1="Java";
        String s2=new String("Java");
        String s3=new String(new char[]{'J','a','v','a'});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));//==比較記憶體位置
        //物件型別使用==的時機， a與b是否指向同一物件
        String a="Java";
        String b=a;//b指向a的位置
        System.out.println(a==b);
    }
   
}
