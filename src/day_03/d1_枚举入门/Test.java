package day_03.d1_枚举入门;

public class Test {
    public static void main(String[] args) {
        //枚举格式
        /*
        public enum 枚举类名{
            //常量名
            //类中其他成员
        }
        */

        //枚举是一种特殊的类:用于描述该类型的若干个(指定个数个)对象。
        //如果一类事物,拥有制定个对象,可以考虑使用枚举。

        A a1 = A.X;
        //打印的不是地址值,说明枚举中默认重写了totring();
        System.out.println("a1 = " + a1);
        A a2 = A.Y;
        A a3 = A.Z;
    }
}
