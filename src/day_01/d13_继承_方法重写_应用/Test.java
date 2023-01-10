package day_01.d13_继承_方法重写_应用;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        //s.show();
        //默认的toString展示的是对象地址值的字符串形式   -->没有意义
        System.out.println("s.toString() = " + s.toString());
        //输出语句,打印对象,底层默认调用对象的toString功能,展示对象的内容
        System.out.println(s);
    }
}
