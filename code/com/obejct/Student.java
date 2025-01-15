package com.obejct;

// 类
public class Student {
    String name;
    double chinese;
    double math;


    public void printTolalScore() {
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println(name + "的总成绩是：" + (chinese + math) / 2.0);
    }
}
