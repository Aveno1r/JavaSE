package day_12self.demo5_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String id;
    private int money;

    public Account() {
    }

    public Account(String id, int money) {
        this.id = id;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
    private Lock lk = new ReentrantLock();
    //取钱
    public  void drawMoney(int money){
        Thread thread = Thread.currentThread();

            lk.lock();
            if (this.money >= money){
                System.out.println(thread.getName() + "取了" + money + "元钱");
                //修改余额
                this.money -= money;
                //显示余额
                System.out.println(thread.getName() + "取钱后,余额为" + this.money + "元");
            }else{
                System.out.println(thread.getName() + "余额不足");
            }
            lk.unlock();
    }
}
