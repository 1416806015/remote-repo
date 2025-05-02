package d8_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程的创建方式三：实现Callable接口
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3、创建一个Callable的对象
        MyCallable call = new MyCallable(100);

        // 4、把Callable的对象封装成一个FutureTask对象 （任务对象）
        //FutureTask(未来任务对象) 什么作用？
        // 1、是一个任务对象，实现了Runnable对象
        // 2、可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1 = new FutureTask<>(call);

        // 5、把任务对象交给一个Thread对象
        new Thread(f1).start();

        // 线程2
        MyCallable call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();


        // 6、获取线程执行完毕后返回的结果
        String rs = f1.get();
        System.out.println(rs);

        String rs2 = f2.get();
        System.out.println(rs2);

    }
}
