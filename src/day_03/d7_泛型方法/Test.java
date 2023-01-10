package day_03.d7_泛型方法;

public class Test {
    public static void main(String[] args) {
        /*
        修饰符 <类型变量，类型变量，…>  返回值类型 方法名(形参列表) {

        }
        方法上的泛型,不能有效直观的优化代码,实际开发,使用较少。
         */
        String s = test("abc");
        Boolean test = test(true);
    }

    public static <T>  T test(T t){
        Student s  = (Student) t;
        s.print();
        return t;
    }

    //public static <T>  T test2(Object o){
    //    Student s = (Student) o;
    //    s.print();
    //    return (T)s;
    //}
}
