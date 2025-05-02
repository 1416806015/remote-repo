package d10_thread_safe;

public class TreadTest {
    public static void main(String[] args) {
        // 1、创建一个账户对象，代表俩人的共同账户
        Accout acc = new Accout("ICBC-110", 10000);

        // 2、创建两个线程，分别代表小明和小红，再去同一个账户取钱10w
        new DrawThread(acc, "小明").start();//小明
        new DrawThread(acc, "小红").start();//小红

    }
}
