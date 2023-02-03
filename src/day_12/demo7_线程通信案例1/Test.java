package day_12.demo7_线程通信案例1;

public class Test {
    // 旗帜变量
    public static boolean flag = false;

    public static void main(String[] args) {
        /*
            如何实现等待唤醒机制:
                使用锁对象调用wait()方法进入无限等待
                使用锁对象调用notify()\notifyAll()方法唤醒线程
                调用wait(),notify(),notifyAll()方法的锁对象要一致(同一个对象)

           分析等待唤醒机制程序的执行
                不管是否使用等待唤醒机制,**线程的调度都是抢占式**
                线程进入无限等待,线程就会释放锁,cpu,也不会再去争夺
                唤醒其他线程,当前唤醒线程是不会释放锁,cpu的
                无限等待线程被唤醒,拿到锁对象后,会从进入无限等待的位置继续往下执行

         */
        // 需求: 实现2条线程有规律的执行---线程通信
        // 线程1: 打印i循环
        // 主线程: 打印j循环
        /*
            规律执行: 打印1次i循环,然后打印1次j循环
            分析:
                线程1打印1次i循环,进入等待,唤醒主线程来执行
                主线程打印1次j循环,进入等待,唤醒线程1来执行

           设计: 设计一个开关变量,用来作为线程1和主线程是否执行的标志
           实现:
                1.设计一个boolean类型的开关变量,true表示主线程执行,false表示线程1执行
                2.如果开关变量的值为true,那么线程1就得无限等待,如果为false,线程1就要执行
                2.如果开关变量的值为false,那么主线程就得无限等待,如果为true,主线程就要执行
         */

        MyThread mt = new MyThread();
        mt.start();

        for (int j = 0; j < 10; j++) {
            synchronized (mt) {
                if (flag == false) {
                    // 无限等待
                    try {
                        mt.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (flag) {
                    // 执行代码
                    System.out.println("主线程 j = " + j);
                    // 执行完了代码,唤醒线程1来执行
                    mt.notify();
                    // 把旗帜变量修改为false
                    flag = false;
                }
            }
        }
    }
}
