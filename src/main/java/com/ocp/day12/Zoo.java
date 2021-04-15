package com.ocp.day12;
public class Zoo {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.shout();
        //cat.hunter();錯誤因為Cat裡面沒有hunter()
        Tiger tiger=new Tiger();
        tiger.shout();
        tiger.hunter();
        //多型宣告(就是一種權限)
        Cat cat2=new Tiger();
        //cat2.hunter();錯誤因為Cat裡面沒有hunter()可不可以呼叫跟實體沒有關係
        cat2.shout();//對Tiger實體下達shout()命令
    }
}
