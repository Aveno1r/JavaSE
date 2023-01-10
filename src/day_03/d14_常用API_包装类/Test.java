package day_03.d14_常用API_包装类;

public class Test {
    public static void main(String[] args) {
        //由于包装类类型较多,接下来统一以int及其包装类为例。
        //由于基本类型与引用类型的转换,在开发中是频繁的,jdk5,设计处理自动装箱和自动拆箱


        //装箱:根据基本类型,得到对应的引用类型(包装类)
        int i = 10;
        //Integer的构造方法  根据int得到对应的Integer对象
        Integer ii1 = new Integer(i);
        System.out.println("ii1 = " + ii1);
        //Integer静态方法   根据int得到对应的Integer对象
        Integer ii2 = Integer.valueOf(i);
        System.out.println("ii2 = " + ii2);
        //自动装箱
        Integer ii3 = i;
        System.out.println("ii3 = " + ii3);


        //拆箱:根据对应的引用类型(包装类),得到基本类型
        Integer ii = new Integer(20);
        //Integer非静态方法  根据当前对象得到对应的基本类型
        int i1 = ii.intValue();
        System.out.println("i1 = " + i1);
        //自动拆箱
        int i2 = ii;
    }
}
