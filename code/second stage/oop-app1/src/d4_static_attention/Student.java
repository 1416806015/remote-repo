package d4_static_attention;

public class Student {

    static String schoolName; //类变量
    double score; //实例变量

    //类方法中可以直接访问类的成员，不可以直接访问实例成员。
    public static void printHelloWorld(){
        Student.schoolName="哈哈";
        Student.printHelloWorld2();
//        System.out.println(score); 报错
        //printPass();   报错
       // System.out.println(this);  报错
    }

    //类方法
    public static void printHelloWorld2(){

    }
    //实例方法中既可以直接访问类成员，也可以直接访问指定成员。
    //实例方法
    // 实例方法中可以出现this关键字。类方法中不可以出现this的关键字。
    public void printPass(){
        schoolName="哈哈哈哈";
        printHelloWorld2();

        System.out.println(score);
        printPass2();
    }

    private void printPass2() {

    }
}
