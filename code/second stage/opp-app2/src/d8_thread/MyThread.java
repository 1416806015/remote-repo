package d8_thread;

/**
 * 1、让子类继承Thread类
 */
public class MyThread extends Thread {
    // 2、必须重写Thread类的run方法

    @Override
    public void run() {
        // 描述线程的执行任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程MyThread线程输出：" + i);
        }
    }
}
