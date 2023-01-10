package day_01.d2_static_类变量_应用场景;

public class Test {
    public static void main(String[] args) {
        //统计用户对象的创建次数

        User u1 = new User();
        System.out.println("u1.number = " + u1.number);
        User u2 = new User();
        //没有变量名接收的对象,叫做匿名对象
        new User();
        new User();
        new User();
        System.out.println("u2.number = " + u2.number);
        User u3 = new User("沈潇");
        new User("沈潇1");
        User u5 = new User("沈潇2");
        System.out.println("User.number = " + User.number);
    }
}
