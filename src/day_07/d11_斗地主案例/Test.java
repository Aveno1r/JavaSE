package day_07.d11_斗地主案例;

public class Test {
    public static void main(String[] args) {
        //1.定义表示牌的类(属性:花色,牌面值,牌的大小)
        //2.定义表示房间的类(属性:牌盒(集合)   行为:开始玩牌(a.洗牌 b.发牌 c.看牌))
        //3.创建房间对象,启动游戏

        Room room = new Room();
        room.start();
    }
}
