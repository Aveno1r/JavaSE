package day_08.d20_递归入门;

public class Test {
    public static void main(String[] args) {
        //递归:方法调用自己  两个方法之间相互调用。
        //递归如果,没有“出口”,就会造成死循环,从而导致方法调用次数过多.产生栈内存溢出的现象。
        //test();
        //test2();
        //如何学习递归
        //1.规律
        //2.出口
    }
    //java.lang.StackOverflowError  栈内存溢出
    //public  static void test(){
    //    System.out.println("test");
    //    test();
    //}

    public static void test2(){
        test3();
    }
    public static void test3(){
        test2();
    }
}
