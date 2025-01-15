package com.construct;

public class Student {
    // 无参构造器
    String name;
    double score;

    public Student() {
        System.out.println("无参构造器被执行了");
    }

    // 有参构造器
    public Student(String name, double score) {
        System.out.println("有参构造器被执行了");
        this.name = name;
        this.score = score;
    }
}

