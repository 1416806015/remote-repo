package d20_reflect;

public class Cat {
    public static int a;
    public static final String COUNTRY = "中国";
    private String name;
    private int age;

    public Cat() {
        System.out.println("无参构造器执行了！！");
    }

    public void run() {
        System.out.println("🐱跑的贼快~~");
    }

    public void eat() {
        System.out.println("🐱爱吃猫粮~~");
    }

    private String eat(String name) {
        return "🐱最爱吃:" + name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Cat.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
