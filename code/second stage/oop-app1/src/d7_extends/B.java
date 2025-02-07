package d7_extends;

import java.security.PublicKey;

public class B extends A{
    public int k;
    // 子类是可以继承父类的非私有成员
    public void print3(){

        System.out.println(i);
        print1();

    }}
