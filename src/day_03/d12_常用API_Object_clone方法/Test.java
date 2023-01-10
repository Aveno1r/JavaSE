package day_03.d12_常用API_Object_clone方法;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        //需要使用clone方法类,在重写该方法的同时,需要实现一个特殊的标记性接口Cloneable

        //public User(String id, String username, String password, double[] scores)
        User u1 = new User("001","张三","123456",new double[]{98,99.5,100});


        System.out.println("u1.getId() = " + u1.getId());
        System.out.println("u1.getUsername() = " + u1.getUsername());
        System.out.println("u1.getPassword() = " + u1.getPassword());
        System.out.println("u1.getScores() = " + u1.getScores());

        System.out.println("-----------------------");
        User u2 = (User) u1.clone();//java.lang.CloneNotSupportedException
        System.out.println("u2.getId() = " + u2.getId());
        System.out.println("u2.getUsername() = " + u2.getUsername());
        System.out.println("u2.getPassword() = " + u2.getPassword());
        System.out.println("u2.getScores() = " + u2.getScores());

        System.out.println("(u1==u2) = " + (u1 == u2));//false
    }
}
