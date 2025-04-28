package d49_SetTest;

//    目标：了解一下哈希值。
//    Java中的所有对象，都可以调用obejct类提供的hashCode方法，返回该对象自己的哈希值。
//    publicinthashCodeO：返回对象的哈希值。
//    同一个对象多次调用hashCodeO方法返回的哈希值是相同的。
//    不同的对象，它们的哈希值一般不相同，但也有可能会相同（哈希碰撞）。

public class SetTest2 {
    public static void main(String[] args) {

        Student s1 = new Student("蜘蛛精", 23, 199.2);
        Student s2 = new Student("紫霞", 20, 99.2);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
