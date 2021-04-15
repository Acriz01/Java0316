package com.ocp.day12;
class Father{
    public Father() {
        System.out.println("Father");
    }
}
class Son{
    public Son() {
        System.out.println("Son");
    }
}
public class Family {
    public static void main(String[] args) {
        Son son=new Son();
    }
}
