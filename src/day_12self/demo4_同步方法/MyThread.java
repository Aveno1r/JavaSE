package day_12self.demo4_同步方法;


public class MyThread extends Thread{
    private Account account;

    public MyThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(1000);
    }
}
