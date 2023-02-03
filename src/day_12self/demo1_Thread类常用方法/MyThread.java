package day_12self.demo1_Thread类常用方法;

public class MyThread extends Thread{
    @Override
    public void run() {
        Thread thread = new Thread("sx");
        String name = thread.getName();
        System.out.println("name = " + name);
        String name1 = Thread.currentThread().getName();
        System.out.println("name1 = " + name1);

    }
}
