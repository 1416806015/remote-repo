package d16_polymorphism_2;

public class Teacher extends People {
    public String name="子类Teacher的名称";
    @Override
    public void run(){

        System.out.println("老师跑的贼慢~~~");
    }
    public void teach(){
        System.out.println("老师需要教学~~~");
    }
}
