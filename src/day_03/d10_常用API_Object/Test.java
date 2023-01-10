package day_03.d10_常用API_Object;

public class Test {
    public static void main(String[] args) {
        //通常,默认的方法,都试通过地址值操作的,但是一般默认方法没有意义。
        //所以,一般情况下,子类需要重写Object中的方法。

        //创建学生对象,使用继承子Object中的方法
        Student s = new Student();
        //默认继承的toString方法,返回对象地址值字符串形式
        System.out.println("s.toString() = " + s.toString());
        //直接打印对象，打印语句的底层会调用toString方法
        System.out.println(s);


        Student s2 = new Student();
        System.out.println("(s==s2) = " + (s == s2));//false
        //默认继承的equals方法,是通过对象的地址值比较两个对象是否相同
        System.out.println("s.equals(s2) = " + s.equals(s2));
    }
}
