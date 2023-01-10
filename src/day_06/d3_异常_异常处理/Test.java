package day_06.d3_异常_异常处理;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        //main方法中,异常抛出处理,问题就会交给虚拟机,导致程序中断
        //如果问题出现后,想让程序继续执行,通过捕获的方式处理
        try {
            //try中的代码是一个整体,有一个报异常,整个try中的内容都不会再执行
            tese1();
            System.out.println(1/0);
            System.out.println("1/0");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        //} catch (Exception e) {
        //    e.printStackTrace();
        //    //提示用户  如果用一个Exception，问题没有办法分开提示
        //}

        System.out.println("over");
    }

    public static void tese1(){
        tese2();
    }

    public static void tese2(){
        int[] arr ={1,2,3};
        System.out.println("arr[3] = " + arr[3]);
    }
}
