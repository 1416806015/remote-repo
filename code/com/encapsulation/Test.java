package com.encapsulation;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(88.2);
        System.out.println(s1.getScore());
        s1.printPass();
    }
}
