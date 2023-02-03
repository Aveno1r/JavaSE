package day_12self.demo8_线程通信;



public class BaoZiPuThread extends Thread{
        BaoZi bz;

    public BaoZiPuThread( BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                if (bz.isFlag()){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (bz.isFlag() == false){
                    System.out.println("吃包子");
                    bz.notify();
                    bz.setFlag(true);
                }
            }
        }
    }
}
