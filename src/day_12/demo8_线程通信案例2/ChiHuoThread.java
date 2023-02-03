package day_12.demo8_线程通信案例2;

public class ChiHuoThread extends Thread{
    BaoZi bz;

    public ChiHuoThread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                // 如果开关变量的值为false,那么吃货线程就得无限等待
                if (bz.isFlag() == false){
                    try {
                        bz.wait();// 无限等待--释放锁和cpu
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果为true,吃货线程就要执行
                if (bz.isFlag()){
                    // 吃包子
                    System.out.println("吃货线程: 开始吃包子...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃货线程: "+bz.getXian()+"的包子真好吃,包子吃完了,包子铺线程快来做包子...");

                    // 修改包子的状态
                    bz.setFlag(false);

                    // 唤醒包子铺线程来做包子
                    bz.notify();
                }
            }
        }
    }
}
