package d19_abstract2;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握抽象类的好处
        Animal animal=new Cat();
        animal.setName("叮当猫");
        animal.cry();
        Animal animal1=new Dog();
        animal1.setName("哒哒哒");
        animal1.cry();
    }
}
