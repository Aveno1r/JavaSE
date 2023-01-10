package day_06.d1_异常入门;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) /*throws ParseException*/ {
        Integer ii = Integer.valueOf("123");

        //Integer ii2 = Integer.valueOf("abc");//java.lang.NumberFormatException: For input string: "abc"
        //异常,如果交给了jvm处理,（异常触发了）中断程序的执行,将错误信息打印到控制台。


        //编译时异常   编译时会报错的异常(必须要进行处理的异常)
        //           处理以后,运行的时候,如果没有问题,不会报错,如果有问题,还是会除法报错
        //运行时异常   运行时可能会报错的异常
        //           如果没有问题,不会报错,如果有问题,还是会触发报错

        //如何处理异常
        //          编译时异常,必须明确的处理
        //          运行时异常,默认被以抛出的形式处理，也可以使用捕获的方式处理(一旦捕获,就不会交给调用者)
        //处理方式
        //          抛出异常:不负责任,交给别人(调用方法的位置)进行处理   在方法签名上使用throws 异常类型1,异常类型2...
        //          捕获异常:负责任,自己(当前方法的位置内)进行处理  该问题,不会再交给调用者(意味着不会交给jvm)在方法内使用try...catch...
        //编译时异常,方法内没有处理,调用者需要自己进一步决定如何处理异常

        //如果捕获了异常,还想在问题发生的时候,在控制台看哪里报错。Throwable 提供了一个方法printStackTrace用于打印错误信息
        //try {
        //    test1();
        //} catch (ParseException e) {
        //    System.out.println("日期格式有误...");
        //}
        //test2();

        try {
            test3();
        }catch (ArithmeticException e){
            System.out.println("除数为0了");
            e.printStackTrace();
        }
        System.out.println("over");
    }

    //编译时异常--不负责任--声明异常
    public static void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("2000-12-12");
        String time = "2000年10月10日";
        Date date = sdf.parse(time);
    }

    //编译时异常--负责任--捕获异常
    public static void test2() {
        SimpleDateFormat sdf = new SimpleDateFormat("2000-12-12");
        String time = "2000年10月10日";
        //try中的代码会被特殊的语法检查
        //catch中,负责捕捉try中存在的异常
        try {
            Date date = sdf.parse(time);
        } catch (ParseException e) {
            //书写,捕捉到问题后,要进行的处理方案
            System.out.println("日期的格式和时间的样式不一致....,,");
        }
    }

    //运行时异常 声明了所有的运行时异常的爹
    public static void test3() /*throws RuntimeException*/{
        System.out.println(1/0);//ArithmeticException: / by zero
    }


}
