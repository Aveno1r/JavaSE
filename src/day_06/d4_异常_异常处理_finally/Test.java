package day_06.d4_异常_异常处理_finally;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            System.out.println("语句1");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            //finally中,存放的是一定会执行的代码 保证虚拟机结束之前,里面的内容一定会被执行。
            System.out.println("语句2");
        }

        System.out.println("语句3");
    }
}
