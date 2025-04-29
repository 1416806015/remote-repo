package d52_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    // 牌
    private List<Card> allCards = new ArrayList<>();

    public Room() {
        // 1、作出54张牌，存入到集合allCards
        // a.点数：个数确定了，类型确定
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // b.花色：
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 0;   // 表示每张牌的大小
        // c.遍历点数
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                // 得到一张牌
                Card c = new Card(number, color, size);
                allCards.add(c);  // 存入了牌
            }
        }
        // 单独存入小大王
        Card c1 = new Card("", "🃏", ++size);
        Card c2 = new Card("", "🃏", ++size);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌：" + allCards);
    }

    /*
     * 游戏启动方法
     * */
    public void start() {
        // 1、洗牌 allCards
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 2、发牌，首先定义三个玩家
        List<Card> linHuChong = new ArrayList<>();
        List<Card> jiuMoZhi = new ArrayList<>();
        List<Card> renYingYing = new ArrayList<>();
        // 正式发牌给玩家，依次发51张牌，剩余3张牌做为底牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            // 判断牌发给谁
            if (i % 3 == 0) {
                // 请令狐冲接牌
                linHuChong.add(c);
            } else if (i % 3 == 1) {
                jiuMoZhi.add(c);
            } else if (i % 3 == 2) {
                renYingYing.add(c);
            }
        }

        // 3.对3个玩家的牌进行排序
        sortCards(linHuChong);
        sortCards(jiuMoZhi);
        sortCards(renYingYing);

        // 4、看牌
        System.out.println("linHuChong = " + linHuChong);
        System.out.println("jiuMoZhi = " + jiuMoZhi);
        System.out.println("renYingYing = " + renYingYing);
        List<Card> lastTreeCards = allCards.subList(allCards.size() - 3, allCards.size()); // 51 52 53
        System.out.println("底牌： " + lastTreeCards);
        jiuMoZhi.addAll(lastTreeCards);
        sortCards(jiuMoZhi);
        System.out.println("jiuMoZhi 抢到地主之后: " + jiuMoZhi);
    }

    /*
     *  集中进行排序
     * */

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();  // 升序排
            }
        });
    }
}
