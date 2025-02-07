package d8_extends_application;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("波仔");
        teacher.setSkill("java spring");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        teacher.printInfo();
    }
}
