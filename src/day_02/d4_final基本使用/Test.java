package day_02.d4_final基本使用;

public class Test {
    public static void main(String[] args) {
        System.out.println(3.14);
        System.out.println(Utils.PI);



        //修饰变量,一旦赋值,值不能在发送改变
        final int I =10;
        System.out.println("I = " + I);
        //I=20;//error

        //final修饰变量,如果是基本类型,值不能改变
        //如果是引用类型,其地址值不能改变,但是对象内容的值可以改变
        final Student S = new Student();
        //S=new Student();//error
        S.name="张三";
        S.name = "沈潇";
        System.out.println("S.name = " + S.name);
    }
}

//修饰类,类不能被继承
final class Fu{}
//class Zi extends Fu{}//error

//修饰方法,方法不能被重写
class Fu2{
    public final void show(){}
}
class Zi2 extends Fu2{
    //@Override
    //public void show(){}
}