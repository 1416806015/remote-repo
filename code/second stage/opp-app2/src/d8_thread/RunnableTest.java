package d8_thread;

/**
 * 线程的创建方式二 ：实现Runnable接口
 */
public class RunnableTest {
    public static void main(String[] args) {
        // 3、创建任务对象
        MyRunnable target = new MyRunnable();
        // 4、把任务对象交给一个线程对象处理
        new Thread(target).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行了！~" + i);
        }
    }
}
