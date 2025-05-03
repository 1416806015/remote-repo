package d15_thread_pool;

import d8_thread.MyCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test2 {
    public static void main(String[] args) throws Exception {
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());

        //1-2 通过Executors创建一个线程池对象。
        ExecutorService pool = Executors.newFixedThreadPool(17);
//        老师：核心线程数量到底配置多少呢？？？
//        计算密集型的任务：核心线程数量=CPU的核数+1
//        IO密集型的任务：核心线程数量=CPU核数*2

        //2、使用线程处理CallabLe任务。
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
