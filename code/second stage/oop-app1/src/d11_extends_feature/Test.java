package d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 1、Java是单继承的：一个类只能继承一个直接父类；不支持多继承，但是支持多层继承
        // 2、Object类是Java中所有类的祖宗
    }
}

class A{}   //extends Object{}
class B{}
// class C extends B , A{}  x
class D extends B{}
class C extends B{}