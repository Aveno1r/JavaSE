package day_12self.demo7_线程通信1;


public class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
           synchronized (this){
               if (Test.flag){
                   try {
                       this.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

           if (Test.flag == false){
               System.out.println("i = " + i);
                this.notify();
                Test.flag = true;
           }
        }
        }
    }
}
