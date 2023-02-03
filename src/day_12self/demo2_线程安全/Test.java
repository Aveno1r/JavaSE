package day_12self.demo2_线程安全;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("cnm-102", 1000);

        MyThread ming = new MyThread("ming", account);
        MyThread hong = new MyThread("hong", account);

        ming.start();
        hong.start();
    }
}
