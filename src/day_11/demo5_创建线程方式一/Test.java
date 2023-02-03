package day_11.demo5_创建线程方式一;

public class Test {
    public static void main(String[] args) {
        /*
            创建线程方式一:
                1.定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
                2.创建MyThread类的对象
                3.调用线程对象的start()方法启动线程（启动后还是执行run方法的）

            注意:
                1.start方法不能重复调用,也就是线程不能重复启动
                2.不能直接调用run方法,因为调用run方法不会启动线程,只是执行run方法而已
                3.如果要测试多线程的效果,主线程的代码必须放在创建的线程后面
         */

        // 创建MyThread线程对象
        MyThread mt = new MyThread();
        // 调用线程对象的start方法启动线程--自动执行run方法
        mt.start();


        // 不要把主线程任务放在启动子线程之前
        // main方法的代码---主线程---执行main方法的
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }


    }
}
