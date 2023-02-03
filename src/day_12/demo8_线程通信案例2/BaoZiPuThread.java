package day_12.demo8_线程通信案例2;

public class BaoZiPuThread extends Thread{
    BaoZi bz;

    public BaoZiPuThread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                // 如果开关变量的值为true,那么生产线程就得无限等待
                if (bz.isFlag()){
                    try {
                        bz.wait();// 无限等待--释放锁和cpu
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果为false,生产就要执行
                if (bz.isFlag() == false){
                    // 生产包子
                    System.out.println("包子铺线程: 开始做包子...");
                    bz.setXian("猪肉馅");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子铺线程: 包子做好了,吃货快来吃包子...");

                    // 修改包子的状态
                    bz.setFlag(true);

                    // 唤醒吃货来吃包子
                    bz.notify();

                }
            }
        }
    }
}
