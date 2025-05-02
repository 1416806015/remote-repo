package d9_thread_api;

/**
 * 掌握 sleep方法和join方法的作用
 */
public class Thread_api2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            // 休眠5s
            if (i == 3) {
                Thread.sleep(5000);
            }
        }

        // join方法 ：让当前调用这个方法的线程先执行完
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();
        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();
        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();
    }

}
