package day_07.d11_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    //牌盒
    ArrayList<Card> allCards = new ArrayList<>();

    public Room() {
        //1.造牌  从小到大造每一张牌
        //定义一个表示牌大小变量,初始值给0
        int size = 0;
        //定义表示所有牌面值数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //定义表示所有花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //遍历所有的牌面值
        for (String number : numbers) {
            //每拿到一个牌面值,遍历一次所有的花色
            for (String color : colors) {
                //造牌,并将牌放入牌盒
                //Card card = new Card(color, number, size++);
                //allCards.add(card);
                allCards.add(new Card(color, number, size++));
            }
        }

        //单独添加小王，大王
        allCards.add(new Card("小", "🃏", size++));
        allCards.add(new Card("大", "🃏", size++));

        //检查牌是否正确
        System.out.println("allCards = " + allCards);

    }

    //开始游戏
    public void start() {
        //2.洗牌
        Collections.shuffle(allCards);
        System.out.println("打乱后 = " + allCards);
        //3.发牌
        //定义三个集合,代表三个玩家
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();
        //遍历牌盒,获取每一张牌,分发给3个玩家。不含最后3张牌。
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            //分发给三个玩家
            if (i % 3 == 0) {
                //发给玩家1
                player1.add(card);
            } else if (i % 3 == 1) {
                //发给玩家2
                player2.add(card);
            } else {
                //i%3==2  发给玩家2
                player3.add(card);
            }
        }
        //底牌
        // public List<E> subList(int fromIndex, int toIndex)
        List<Card> diPai = allCards.subList(allCards.size() - 3, allCards.size());



        //4.看牌
        //排序
       //Comparator c=  new Comparator<Card>(){
       //
       //     @Override
       //     public int compare(Card o1, Card o2) {
       //         //o1 vs o2
       //         return o1.getSize()-o2.getSize();
       //     }
       // };
       // Collections.sort(player1,c);
       // Collections.sort(player1,(Card o1, Card o2)->{  return o1.getSize()-o2.getSize();});
       // Collections.sort(player1,( o1,  o2)->o1.getSize()-o2.getSize());

        sortCard(player1);
        sortCard(player2);
        sortCard(player3);
        sortCard(diPai);
        //展示牌
        System.out.println("东方不败 = " + player1);
        System.out.println("任盈盈 = " + player2);
        System.out.println("令狐冲 = " + player3);
        System.out.println("底牌 = " + diPai);
    }
    public static void sortCard(List<Card> list){
        Collections.sort(list,( o1,  o2)->o1.getSize()-o2.getSize());
    }
}
