package day_12.demo3_同步代码块;

// 定义一个账户类
public class Account {
    private String cardId;// 卡号
    private double money;// 余额

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardId='" + cardId + '\'' +
                ", money=" + money +
                '}';
    }

    // 取钱的功能
    public void drawMoney(double money) {
        // 获取当前执行的线程对象
        Thread t = Thread.currentThread();

        // 加锁
        synchronized (this) {
            // 判断余额是否足够
            if (this.money >= money) {
                // 够钱,就吐出钱
                System.out.println(t.getName() + "取钱成功,取了" + money + "元");
                // 修改余额
                this.money -= money;
                // 显示余额
                System.out.println(t.getName() + "取完钱后,余额为" + this.money + "元");
            } else {
                // 不够钱,就显示提示信息
                System.out.println(t.getName() + "来取钱,余额不足!");
            }
        } // 自动释放锁

    }
}
