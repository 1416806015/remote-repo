package d8_thread;

import java.util.concurrent.Callable;

/**
 * 1、让这个类实现Callable接口
 */
public class MyCallable implements Callable<String> {
    // 2、重写call方法
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        //描述线程的任务、返回线程执行返回后的结果。
        //需求：求1-n的和返回。
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "线程求出了：1 - " + n + "的和是：" + sum;
    }
}
