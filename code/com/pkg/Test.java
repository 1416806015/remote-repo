package com.pkg;

import com.thisdemo.Demo1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1.同一个包下的程序可以直接访问
        Demo d1 = new Demo();
        d1.print();
        // 2.访问其他包下的程序，必须导包才可以访问
        Demo1 d2 = new Demo1();
        d2.print();
        // 3.自己的程序中调用java提供的程序，也需要先导包才可以使用；注意：Java.lang包下的程序是不需要我们导包的，可以直接使用
        Scanner sc = new Scanner(System.in);
        String string = "hhhhhh";
        Random r = new Random();
        //4.访问多个其他包下的程序，这些程序名又一样的情况下，默认只能导入一个程序，另一个程序必须带包名和类名来访问
        Demo2 d3 = new Demo2();
        d3.print();
        com.thisdemo.Demo2 d4 = new com.thisdemo.Demo2();
        d4.print();

    }
}
