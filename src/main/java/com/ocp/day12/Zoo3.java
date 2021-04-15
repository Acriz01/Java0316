
package com.ocp.day12;

public class Zoo3 {
    public static void main(String[] args) {
        Cat cat=new Tiger();
        cat.shout();
        ((Tiger)cat).hunter();
        Cat cat2=new Cat();
        ((Tiger)cat2).hunter();
    }
}
