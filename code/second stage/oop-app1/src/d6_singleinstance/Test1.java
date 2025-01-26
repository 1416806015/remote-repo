package d6_singleinstance;

public class Test1 {
    public static void main(String[] args) {
        A a1= A.getObject();
        A a2= A.getObject();
        System.out.println(a1);
        System.out.println(a2);
    }
}
