package com.ocp.day29_assert;
public class AssertDemo {
    public static void main(String[] args) {
        int score=400;
        assert(score>=0&&score<=100):"分數錯誤:"+score;
        System.out.println(score>=60?"pass":"Fail");
    }
    
}
