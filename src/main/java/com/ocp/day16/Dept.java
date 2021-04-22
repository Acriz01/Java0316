package com.ocp.day16;

//外部類別
public class Dept {
    String name="IT";
    public static final String companyName="HaHa";
    //一般內部類別
    public class Staff {
        private String name="John";
        public void job(){
            String name="寫程式";
            System.out.printf("%s 在 %s 公司的 %s 部門下 %s \n",
                    this.name,companyName,Dept.this.name,name);
        }
    }
}
