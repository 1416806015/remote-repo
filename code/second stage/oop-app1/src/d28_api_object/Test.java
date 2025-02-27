package d28_api_object;

public class Test {
    public static void main(String[] args) {
        // Object类提供的常用方法
        Student s1=new Student("赵敏",23);
        //System.out.println(student.toString());
        System.out.println(s1);
        Student s2=new Student("赵敏",23);
        System.out.println(s1.equals(s2));
    }
}
