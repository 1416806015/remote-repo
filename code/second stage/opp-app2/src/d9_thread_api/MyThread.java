package d9_thread_api;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name); // 为当前线程设置名字
    }

    @Override
    public void run() {
        // 哪个线程执行它，它就会得到哪个线程的名字
        Thread m = Thread.currentThread();
        for (int i = 0; i < 4; i++) {
            System.out.println(m.getName() + "输出：" + i);
        }
    }
}
