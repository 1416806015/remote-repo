package d38_math;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1、public static Runtime getRuntime (） 返回与当前Java应用程序关联的运行时对象。
        Runtime r = Runtime.getRuntime();

        //2、public void exit(int status)：终止当前运行的虚拟机。按照惯例，非零状态代码表示异常终止。
        // r.exit(0);

        // 3、public int availableProcessors()：获取虚拟机能够使用的处理器数。
        System.out.println(r.availableProcessors());

        // 4、public long totalMemory()：返回Java虚拟机中的内存总量。
        System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB");

        // 5、public long freeMemory()：返回Java虚拟机中的可用内存量
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");

        //public Process exec(String command) 启动某个程序，并返回代表该程序的对象
//        Process p = r.exec("QQ");
//        Thread.sleep(5000);
//        p.destroy(); // 销毁！关闭程序

    }
}
