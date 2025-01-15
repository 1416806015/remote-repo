package com.javabean;

public class Student {
    //1.这个类的成员变量都要私有，并对外提供get、set方法
    private String name;
    private double score;

    //2.类中必须要有一个公共的无参的构造器
    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}
