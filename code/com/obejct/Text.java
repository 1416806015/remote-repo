package com.obejct;

public class Text {
    public static void main(String[] args) {
        //目标：面向对象编程，快速入门
        //1.先创建一个学生对象，封装波妞的数据
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 90;
        s1.printTolalScore();
        s1.printAverageScore();
    }
}
