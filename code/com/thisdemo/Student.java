package com.thisdemo;

public class Student {
    double score; //当前对象(成员变量）

    public void printThis() {
        System.out.println(this);
    }

    public void pritnPass(double score) {
        // this.score 指的是访问当前对象（成员变量）的score
        //避免名称一样发生冲突
        //第二个score是方法内部的变量
        if (this.score > score) {
            System.out.println("恭喜你，您成功考入了哈弗大学了~");
        } else {
            System.out.println("落选了");
        }
    }
}
