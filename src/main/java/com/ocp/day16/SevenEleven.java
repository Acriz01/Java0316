
package com.ocp.day16;

public class SevenEleven {
    //結帳方法
    public void submit(int price){// java7要加上final但8不用，可自動 
        String name="微粒炸醬麵";// java7要加上final但8不用，可自動 final String name="微粒炸醬麵";
        //結帳類別
        class Transaction{
            //交易資料
            void print(){
                System.out.printf("%s交易金額: %d\n",name,price);
            }
        }
        Transaction t=new Transaction();
        t.print();
    }
    //main獨立於上面結構之外
    public static void main(String[] args) {
        SevenEleven se=new SevenEleven();
        se.submit(100);
    }
}
