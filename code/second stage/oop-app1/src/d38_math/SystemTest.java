package d38_math;

public class SystemTest {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出了:" + i);
        }
        long timeMillis2 = System.currentTimeMillis();
        System.out.println(timeMillis2 - timeMillis);
    }
}
