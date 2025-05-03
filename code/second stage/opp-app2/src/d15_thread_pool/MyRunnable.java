package d15_thread_pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 任务是干什么的
        System.out.println(Thread.currentThread().getName() + "==>输出了666");
        try {
            //Thread.sleep(1000);
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
