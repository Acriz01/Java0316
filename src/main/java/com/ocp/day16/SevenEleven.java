
package com.ocp.day16;

public class SevenEleven {
    //結帳方法
    public void submit(int price){
        //結帳類別
        class Transaction{
            //交易資料
            void print(){
                System.out.printf("交易金額: %d\n",price);
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
