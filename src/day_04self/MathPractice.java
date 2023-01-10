package day_04self;

public class MathPractice {
    public static void main(String[] args) {
//        public static int abs(int a)	获取参数绝对值
//        public static double ceil(double a)	向上取整
//        public static double floor(double a)	向下取整
//        public static int round(float a)	四舍五入
//        public static int max(int a,int b)	获取两个int值中的较大值
//        public static double pow(double a,double b)	返回a的b次幂的值
//        public static double random()	返回值为double的随机值，范围[0.0,1.0)

        System.out.println("Math.abs(-99.0) = " + Math.abs(-99.0));
        System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
        System.out.println("Math.floor(5.4) = " + Math.floor(5.4));
        System.out.println("Math.round(4.4) = " + Math.round(4.4));
        System.out.println("Math.round(5.6) = " + Math.round(5.6));
        System.out.println("Math.max(4,20) = " + Math.max(4, 20));
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));
        System.out.println("Math.random() = " + Math.random());
    }
}
