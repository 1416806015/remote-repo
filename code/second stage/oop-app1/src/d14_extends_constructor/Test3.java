package d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        Student student1=new Student("张三",18,"家里蹲大学");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSchoolName());
        System.out.println("============================");
        // 需求：如果学生没有填写学校，默认家里蹲大学
        Student student2=new Student("里斯",12);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getSchoolName());


    }
}

class Student{
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.schoolName="家里蹲大学";
    }
    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
