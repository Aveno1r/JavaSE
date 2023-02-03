package day_12self.demo8_线程通信;


import static day_12self.demo7_线程通信1.Test.flag;

public class ChiHuoThread extends Thread{
    BaoZi bz;

    public ChiHuoThread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                if (bz.isFlag() == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (bz.isFlag()){
                    System.out.println("生产包子");
                    bz.notify();
                    bz.setFlag(false);
                }
            }
        }
    }
}
