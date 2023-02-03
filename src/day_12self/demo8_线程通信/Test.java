package day_12self.demo8_线程通信;

public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPuThread baoZiPuThread = new BaoZiPuThread(bz);
        ChiHuoThread chiHuoThread = new ChiHuoThread(bz);
        baoZiPuThread.start();
        chiHuoThread.start();
    }
}
