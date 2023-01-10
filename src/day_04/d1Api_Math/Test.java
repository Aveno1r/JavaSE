package day_04.d1Api_Math;

public class Test {
    public static void main(String[] args) {

        //public static int abs(int a)	获取参数绝对值
        System.out.println("Math.abs(-5) = " + Math.abs(-5));
        System.out.println("Math.abs(5) = " + Math.abs(5));

        //public static double ceil(double a)	向上取整
        System.out.println("Math.ceil(2.3) = " + Math.ceil(2.3));
        System.out.println("Math.ceil(2.7) = " + Math.ceil(2.7));

        //public static double floor(double a)	向下取整
        System.out.println("Math.floor(2.3) = " + Math.floor(2.3));
        System.out.println("Math.floor(2.7) = " + Math.floor(2.7));

        //public static int round(float a)	四舍五入
        System.out.println("Math.round(2.3) = " + Math.round(2.3));
        System.out.println("Math.round(2.7) = " + Math.round(2.7));

        //public static int max(int a,int b)	获取两个int值中的较大值
        System.out.println("Math.max(10,20) = " + Math.max(10, 20));

        //public static double pow(double a,double b)	返回a的b次幂的值
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        //public static double random()	返回值为double的随机值，范围[0.0,1.0)
        System.out.println("Math.random() = " + Math.random());
        //获取1~10之间的随机数
        //(int)(Math.random()*10+1)  //[0,10)+1==>[1,11)
    }
}
