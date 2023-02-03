package day_12.demo7_线程通信案例1;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (Test.flag) {
                    //无限等待
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (Test.flag == false) {
                    // 执行代码
                    System.out.println("线程1  i = " + i);
                    // 执行完了代码,唤醒主线程来执行
                    this.notify();
                    // 把旗帜变量修改为true
                    Test.flag = true;
                }
            }
        }
    }
}
