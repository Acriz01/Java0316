
package com.ocp.day16;

public class DeptDemo {
    public static void main(String[] args) {
        Dept dept=new Dept();
        Dept.Staff staff=dept.new Staff();
        staff.job();
    }
}
