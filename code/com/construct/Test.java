package com.construct;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("--------------");
        Student s2 = new Student("小米", 100);
        Student s3 = new Student("波妞", 99);
        System.out.println(s3.name);
        System.out.println(s3.score);

    }
}
