package d13_extends_Visit;

public class Z extends F{
    String name="子类名称";
    public void showName(){
        String name="局部名称";
        System.out.println(name); // 局部的
        System.out.println(this.name); // 子类的
        System.out.println(super.name); // 父类的
    }
    @Override
    public void print1(){
        System.out.println("==子类的print1方法执行");
    }
    public void showMethod(){
        print1(); //子类的
        super.print1(); //父类的
    }
}
