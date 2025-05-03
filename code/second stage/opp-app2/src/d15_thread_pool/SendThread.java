package d15_thread_pool;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread {
    private List<String> gift;
    private int count;

    public SendThread(List<String> gift, String name) {
        super(name);
        this.gift = gift;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        // 发礼物
        Random random = new Random();
        while (true) {
            synchronized (gift) {
                if (gift.size() < 10) {
                    break;
                }
                String rs = gift.remove(random.nextInt(gift.size()));
                System.out.println(name + "发出了礼物" + rs);
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
