package com.lab.order_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Food> order = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;

    public static void main(String[] args) {
        while (play) {
            menu();
        }
    }

    public static void menu() {
        sc.menu();
        System.out.print("請輸入:");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch (itemId) {
            case 1:
                sc.printCatalog();
                break;
            case 2:
                System.out.print("請輸入No: ");
                int addNo = scanner.nextInt();
                //在order集合中加入Food
                Food food = sc.getFoodByNo(addNo);
                order.add(food);
                break;
            case 3:
                for (Food f : order) {
                    System.out.println(f);
                }
                break;
            case 4://取消訂單餐點
                break;
            case 5://刪除訂單餐點
                break;
            case 6://結帳
                break;
            case 0://離開
                play = false;
        }
    }
}
