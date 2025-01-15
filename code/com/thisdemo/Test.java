package com.thisdemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        System.out.println("----------------------");

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();
        Student s3 = new Student();
        s3.score = 333;
        s3.pritnPass(250);
    }
}
