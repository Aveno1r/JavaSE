package day_02.d1_多态入门;

public class Test {
    public static void main(String[] args) {
        People p = null;

        p=new Student();
        //System.out.println("p.name = " + p.name);//变量没有多态的体现
        p.run();


        p=new Teacher();
        //System.out.println("p.name = " + p.name);//变量没有多态的体现
        p.run();
    }
}
