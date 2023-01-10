package day_06.d5_异常_异常处理_finally_面试题;

public class Test {
    public static void main(String[] args) {
        System.out.println("method1() = " + method1());//40
        System.out.println("method2() = " + method2());//30
        System.out.println("method3() = " + method3());//40
    }

    public static int method1() {
        int x = 10;
        try {
            x = 20;
            System.out.println(1 / 0);
        } catch (Exception e) {
            x = 30;
            return x;
        } finally {
            //虚拟机结束前,一定执行的内容
            //由于这里的代码一定会执行,catch中的返回结果会被这里的return覆盖掉。
            x = 40;
            return x;
        }
    }


    public static int method2() {
        int x = 10;
        try {
            x = 20;
            System.out.println(1 / 0);
        } catch (Exception e) {
            x = 30;
            return x;
        }

        x = 40;
        return x;
    }

    public static int method3() {
        int x = 10;
        try {
            x = 20;
            return x;
        } catch (Exception e) {
            x = 30;
            return x;
        }finally {
            x = 40;
            return x;
        }
    }
}
