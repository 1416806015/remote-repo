package d15_thread_pool;

import java.util.concurrent.*;

/**
 * 创建线程池
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        // 1、创建线程池对象
//                        public ThreadPoolExecutor(int corePoolSize,
//                        int maximumPoolSize,
//                        long keepAliveTime,
//                        TimeUnit unit,
//                        BlockingQueue<Runnable> workQueue,
//                        ThreadFactory threadFactory,
//                        RejectedExecutionHandler handler)
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        MyRunnable target = new MyRunnable();
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target); // 复用前面的核心线程
        pool.execute(target); // 复用前面的核心线程
        pool.execute(target);
        pool.execute(target);
        // 到了临时线程的创建时机
        pool.execute(target);
        pool.execute(target);

//        pool.shutdown(); // 等待线程池的任务全部执行完后，再关闭线程池
//        pool.shutdownNow(); // 立即关闭线程池


    }
}
