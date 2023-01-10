package day_04.d4Api_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);//0.30000000000000004
        System.out.println(1.0 - 0.32);//0.6799999999999999
        System.out.println(1.015 * 100);//101.49999999999999
        System.out.println(1.301 / 100);//0.013009999999999999

        //小数精准运算(加减乘除) BigDecimal
        //小数作为构造方法参数,获取BigDecimal对象的方式,不能解决精准运算的问题。
        //BigDecimal b1 = new BigDecimal(0.1);
        //BigDecimal b2 = new BigDecimal(0.2);


        //public BigDecimal add(BigDecimal b)	加法
        //获取BigDecimal对象,推荐以字符串形式的小数传入参数
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);

        //public BigDecimal subtract(BigDecimal b)	减法
        BigDecimal b3 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("0.32");
        BigDecimal subtract = b3.subtract(b4);
        System.out.println("subtract = " + subtract);

        //public BigDecimal multiply(BigDecimal b)	乘法
        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        BigDecimal multiply = b5.multiply(b6);
        System.out.println("multiply = " + multiply);

        //public BigDecimal divide(BigDecimal b)	除法
        BigDecimal b7 = new BigDecimal("1.015");
        BigDecimal b8 = new BigDecimal("100");
        BigDecimal divide = b7.divide(b8);
        System.out.println("divide = " + divide);


        //public static BigDecimal valueOf(double val)	转换一个 double成 BigDecimal
        BigDecimal b9 = BigDecimal.valueOf(0.1);
        BigDecimal b10 = BigDecimal.valueOf(0.2);
        BigDecimal add2 = b9.add(b10);
        System.out.println("add2 = " + add2);
        //public double doubleValue()	将BigDecimal转换为double
        double d = add2.doubleValue();
        System.out.println("d = " + d);

        //除法运算除不尽
        BigDecimal b11 = new BigDecimal("10");
        BigDecimal b12 = new BigDecimal("3");
        //BigDecimal divide2 = b11.divide(b12);//error java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal divide2 = b11.divide(b12,2, RoundingMode.HALF_UP);//3.333...
        System.out.println("divide2 = " + divide2);
    }
}
