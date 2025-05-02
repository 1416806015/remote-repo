package d9_thread_api;

public class Thread_ap1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("1号线程");
        // 为线程取名字
//        t1.setName("1号线程");
        t1.start();
        // 获取子线程名字
        System.out.println(t1.getName()); //Thread-0

        MyThread t2 = new MyThread("2号线程");
        // 为线程取名字
        //t1.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); //Thread-1

        // 主线程对象的名字
        // 哪个线程执行它，它就会得到哪个线程的名字
        Thread m = Thread.currentThread();
        System.out.println(m.getName()); // main


        for (int i = 0; i < 4; i++) {
            System.out.println(m.getName() + "输出：" + i);
        }
    }
}
