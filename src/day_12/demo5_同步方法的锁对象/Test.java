package day_12.demo5_同步方法的锁对象;

public class Test {
    public static void main(String[] args) {
        // 需求: 搞2条线程,一条线程使用同步代码块,一条线程使用同步方法,实现同步

        Test t = new Test();

        // 张三上厕所---同步代码块
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 多条线程实现同步,无论使用同步代码块还是同步方法,锁对象必须是同一个锁对象
                synchronized (t) {
                    System.out.println("张三:打开厕所门...");
                    System.out.println("张三:关闭厕所门...");
                    System.out.println("张三:掏手机,点烟,送入嘴里...");
                    System.out.println("张三:脱裤子...");
                    System.out.println("张三:用力...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("张三:擦屁股...");
                    System.out.println("张三:穿裤子...");
                    System.out.println("张三:冲水...");
                    System.out.println("张三:打开厕所门...");
                    System.out.println("张三:洗手,开开心心走人...");
                }
            }
        }).start();

        // 李四上厕所的过程封装成方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                //wc();

                t.wc2();
            }
        }).start();
    }

    // 非静态同步方法: 默认的锁对象--this
    public synchronized void wc2(){
        System.out.println("李四:打开厕所门...");
        System.out.println("李四:关闭厕所门...");
        System.out.println("李四:掏手机,点烟,送入嘴里...");
        System.out.println("李四:脱裤子...");
        System.out.println("李四:用力...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("李四:擦屁股...");
        System.out.println("李四:穿裤子...");
        System.out.println("李四:冲水...");
        System.out.println("李四:打开厕所门...");
        System.out.println("李四:洗手,开开心心走人...");
    }

    // 静态同步方法: 默认的锁对象--当前类的字节码对象(类名.class)
    public static synchronized void wc(){
        System.out.println("李四:打开厕所门...");
        System.out.println("李四:关闭厕所门...");
        System.out.println("李四:掏手机,点烟,送入嘴里...");
        System.out.println("李四:脱裤子...");
        System.out.println("李四:用力...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("李四:擦屁股...");
        System.out.println("李四:穿裤子...");
        System.out.println("李四:冲水...");
        System.out.println("李四:打开厕所门...");
        System.out.println("李四:洗手,开开心心走人...");
    }

}
