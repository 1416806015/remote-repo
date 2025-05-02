package d8_thread;

// 1、定义一个任务类，实现Runnable接口
public class MyRunnable implements Runnable {
    // 2、重写Runnable的run方法
    @Override
    public void run() {
        // 线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程run：执行了！~" + i);
        }
    }
}
