package day_11self.demo07_创建线程22;

public class Test {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("i = " + i);
//                }
//            }
//        });

        //Lambda写法
        Thread t = new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                }
        });
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
