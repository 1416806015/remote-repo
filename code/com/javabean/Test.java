package com.javabean;

public class Test {
    public static void main(String[] args) {
        // 实体类
        Student s = new Student();
        s.setName("波妞");
        s.setScore(98);
        System.out.println(s.getName());
        System.out.println(s.getScore());

        StudentOperator operator = new StudentOperator(s);
        operator.printPass();
    }
}
