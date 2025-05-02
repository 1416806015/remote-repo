package d8_thread;

/**
 * 线程的创建方式二的 匿名内部类 写法：实现Runnable接口
 */
public class RunnableTest2 {
    public static void main(String[] args) {
        // 1、直接创建Runnable接口的匿名内部类形式（任务对象）
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1执行了！~" + i);
                }
            }
        };
        new Thread(target).start();

        // 简化写法1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行了！~" + i);
                }
            }
        }).start();

        // 简化写法2
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3执行了！~" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main执行了！~" + i);
        }
    }
}
