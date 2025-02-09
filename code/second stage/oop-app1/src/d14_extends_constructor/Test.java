package d14_extends_constructor;

public class Test {
    public static void main(String[] args) {
        Z z=new Z();
        Z z2=new Z("波妞");
    }
}

class F{
//    public F(){
//        System.out.println("====父类F的无参构造器执行了====");
//    }
    public F(String name,int age){

    }
}

class Z extends F{
    public Z(String name){
        super("波妞",18);
        System.out.println("====子类Z的有参构造器执行了====");
    }
    public Z(){
        super("波妞",18);
        System.out.println("====父类F的无参构造器执行了====");
    }
}
