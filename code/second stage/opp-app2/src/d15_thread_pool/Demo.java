package d15_thread_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) throws Exception {
        //目标：有100份礼品，
        //小红，小明两人同时发送，当剩下的礼品小于10份的时候则不再送出，
        //利用多线程模拟该过程并将线程的名称打印出来。并最后在控制台分别打印小红，小明各自送出多少分礼物

        // 1、拿100份礼品到程序中来
        List<String> gift = new ArrayList<>();
        String[] names = {"口红", "包包", "剃须刀", "皮带"};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(names[random.nextInt(names.length)] + (i + 1));
        }
        System.out.println(gift);

        // 2、定义线程类，创建线程对象，去集合中拿礼物送人
        SendThread xm = new SendThread(gift, "小明");
        xm.start();
        SendThread xh = new SendThread(gift, "小红");
        xh.start();
        
        xm.join();
        xh.join();
        System.out.println(xm.getCount());
        System.out.println(xh.getCount());

    }
}
