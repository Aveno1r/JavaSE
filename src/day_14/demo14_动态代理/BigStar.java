package day_14.demo14_动态代理;

// 被代理类
public class BigStar implements Star {
    String name;

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "大明星在唱:" + name);
        return "谢谢,谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "大明星在优美的跳舞...");
    }

    @Override
    public String toString() {
        return "BigStar{" +
                "name='" + name + '\'' +
                '}';
    }
}
