package day_04self;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPractice {
    public static void main(String[] args) {
//        public BigDecimal(double val)  注意：不推荐使用这个	将 double转换为 BigDecimal
//        public BigDecimal(String val)  	把String转成BigDecimal
//        public static BigDecimal valueOf(double val)	转换一个 double成 BigDecimal
//        public double doubleValue()	将BigDecimal转换为double
//        public BigDecimal add(BigDecimal b)	加法
//        public BigDecimal subtract(BigDecimal b)	减法
//        public BigDecimal multiply(BigDecimal b)	乘法
//        public BigDecimal divide(BigDecimal b)	除法
//        public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) 	除法、可以控制精确到小数几位

        BigDecimal bd = new BigDecimal("0.1");
        BigDecimal bd1 = new BigDecimal("0.3");
        System.out.println("bd.add(bd1) = " + bd.add(bd1));

        BigDecimal bd2 = new BigDecimal("0.1");
        BigDecimal bd3 = new BigDecimal("0.3");
        System.out.println("bd2.subtract(bd3) = " + bd2.subtract(bd3));

        BigDecimal bd4 = new BigDecimal("0.1");
        BigDecimal bd5 = new BigDecimal("0.3");
        System.out.println("bd4.multiply(bd5) = " + bd4.multiply(bd5));

        BigDecimal bd6 = new BigDecimal("10");
        BigDecimal bd7 = new BigDecimal("3");
        System.out.println("bd6.divide(bd7) = " + bd6.divide(bd7, RoundingMode.HALF_UP));

        System.out.println("BigDecimal.valueOf(38.5) = " + BigDecimal.valueOf(38.5));

    }
}
