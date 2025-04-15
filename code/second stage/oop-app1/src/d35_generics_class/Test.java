package d35_generics_class;

import java.lang.invoke.VarHandle;

public class Test {
    public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();
    list.add("java1");
    list.add("java2");
    list.add("java3");
        String ele = list.get(1);
        System.out.println("ele = " + ele);
        MyArrayList2<String, String> c2 = new MyArrayList2<>();
        MyArrayList2<Cat, String> c3 = new MyArrayList2<>();
        MyClass3<Dog> c4 = new MyClass3<>();
    }

}
