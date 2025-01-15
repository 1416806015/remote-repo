package com.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    //菜品操作类

    //1.定义一个ArrayList集合对象，负责存储菜品信息
    private ArrayList<Food> foodList = new ArrayList<>();

    //2.开发功能：上架菜品
    public void addFood() {
        //3.创建一个菜品对象，封装上架的菜品信息
        Food food = new Food();
        //4.录入菜品信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请您录入菜品的名称：");
        String name = sc.next();
        food.setName(name);
        System.out.println("请您录入菜品的价格：");
        double price = sc.nextDouble();
        food.setPrice(price);
        System.out.println("请您录入菜品的描述：");
        String desc = sc.next();
        food.setDesc(desc);
        //5.把菜品对象录入到集合当中去
        foodList.add(food);
        System.out.println("上架成功~");
    }

    public void showAllFoods() {
        if (foodList.size() == 0) {
            System.out.println("什么菜品都没有，先去上架~~");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println(food.getName());
            System.out.println(food.getPrice());
            System.out.println(food.getDesc());
            System.out.println("-----------------------------");
        }

    }

    //负责展示操作界面
    public void start() {
        while (true) {
            System.out.println("请选择功能：");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择你的操作：");
            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("欢迎下次再来~~");
                    return;
                default:
                    System.out.println("您的输入有误,请重新输入:");

            }
        }
    }
}
