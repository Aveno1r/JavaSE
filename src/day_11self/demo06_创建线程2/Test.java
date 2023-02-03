package day_11self.demo06_创建线程2;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
