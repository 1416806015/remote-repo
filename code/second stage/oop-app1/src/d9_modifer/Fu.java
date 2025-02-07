package d9_modifer;

public class Fu {
    // 1、私有：只能在本类中访问
    private void privateMothod(){
        System.out.println("====private====");
    }

    // 2、缺省:本类，同一个包下的类
    void method(){
        System.out.println("====缺省====");
    }

    // 3、protected：本类，同一个包下的类，任意包下的子类
    protected void protectedMothod(){
        System.out.println("====protected====");
    }

    // 3、public：本类，同一个包下的类，任意包下的子类,任意包下的任意类
    public void publicMothod(){
        System.out.println("====public====");
    }

    public void test(){
        privateMothod();
        method();
        protectedMothod();
        publicMothod();
    }
}
