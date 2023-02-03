package day_11self.demo5_创建线程1;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
