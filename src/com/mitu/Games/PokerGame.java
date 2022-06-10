package com.mitu.Games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokerGame {
    /**
     * 1.定义一个静态集合  存储54张牌
     */
    public static List<Card> cards = new ArrayList<>();

    /*
      2.做牌：初始化牌的数据
     */
    static {
        //3.定义点数
        String[] size = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        //4.定义花色
        String[] color = {"♠", "♥", "♣", "♦"};
        //5.组合牌型
        int index=0 ;
        for (String ss : size) {
            index++;
            for (String cc : color) {
                //6.封装牌对象
                Card c = new Card(cc, ss, index);
                cards.add(c);
            }
        }
        //7.存大小王
        Card c1 = new Card("", "joker", ++index);
        Card c2 = new Card("", "JOKER", ++index);
        Collections.addAll(cards, c1, c2);
        System.out.println("新牌：" + cards);
    }

    public static void main(String[] args) {
        //8.洗牌
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);
        //9.发牌  定义三个玩家  三个牌容器
        List<Card> zs = new ArrayList<>();
        List<Card> lq = new ArrayList<>();
        List<Card> ww = new ArrayList<>();
        //10.发牌

        for (int i = 0; i < cards.size() - 3; i++) {
            if (i % 3 == 0)
                zs.add(cards.get(i));
            else if (i % 3 == 1)
                lq.add(cards.get(i));
            else
                ww .add(cards.get(i));
        }
        //11.地主牌三张
        List<Card> dp = cards.subList(cards.size()-3,cards.size());
        //12.给玩家牌排序
        sortCards(zs);
        sortCards(lq);
        sortCards(ww);
        //13.看每个人的牌  以及底牌
        System.out.println("张三的牌是：" + zs);
        System.out.println("李青的牌是：" + lq);
        System.out.println("王五的牌是：" + ww);
        System.out.println("地主牌是：" + dp);


    }

    private static void sortCards(List<Card> cards) {
        cards.sort(Comparator.comparingInt(Card::getIndex));
    }
}
